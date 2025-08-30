import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private double quantidade;
    public void moveAndTurn(){
  move(4);
  if(Greenfoot.getRandomNumber(100) < 10){
    turn(Greenfoot.getRandomNumber(90)-45);
  }
  if(getX() <=5 || getX() >= getWorld().getWidth() - 5){
    turn(180);
  }
  if(getY() <=5 || getY() >= getWorld().getHeight() - 5){
    turn(180);
  }
}

public void eat(){

      if (isTouching(Worm.class)) {
      removeTouching(Worm.class);
      this.quantidade+=1;
      Greenfoot.playSound("dinheiro-caindo-na-conta.mp3");
  }
  if(isTouching(DinheiroMenor.class)){
      removeTouching(DinheiroMenor.class);
      this.quantidade+=0.5;
      Greenfoot.playSound("dinheiro-caindo-na-conta.mp3");
    }
    
}

public void dead(){
    if(isTouching(Principal.class) || isTouching(Secundario.class)){
        removeTouching(Principal.class);
        removeTouching(Secundario.class);
        Greenfoot.setWorld(new CrabWorld());
    }
}
    public void act()
    {
        moveAndTurn();
        eat();
        dead();
    }
}
