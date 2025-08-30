import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Decapoda extends Actor
{
    private double quantidade = 0;
    private String keyLeft = "left";
    private String keyRight = "right";
    private int showTextX = 100;
    private int showTextY = 10;
    public String nome;
    
    public Decapoda(String keyLeft, String keyRight, int showTextX , int showTextY ){
        this.keyLeft = keyLeft;
        this.keyRight = keyRight;
        this.showTextX = showTextX;
        this.showTextY = showTextY;
    }
    
    public void act(){
      moveAndTurn();
      eat();
    }
    public void moveAndTurn(){
      move(4);
      if (Greenfoot.isKeyDown(keyLeft)){
        turn(-3);
      }
      if (Greenfoot.isKeyDown(keyRight)){
        turn(3);
      }
    }
    public void eat(){

      if (isTouching(Worm.class)) {
      removeTouching(Worm.class);
      this.quantidade+=1;
      getWorld().showText(this.nome + " R$ " + String.valueOf(quantidade), showTextX, showTextY);
      Greenfoot.playSound("dinheiro-caindo-na-conta.mp3");
  }
  if(isTouching(DinheiroMenor.class)){
      removeTouching(DinheiroMenor.class);
      this.quantidade+=0.5;
      getWorld().showText(this.nome + " R$ " + String.valueOf(quantidade), showTextX, showTextY);
      Greenfoot.playSound("dinheiro-caindo-na-conta.mp3");
    }
    
}
}
