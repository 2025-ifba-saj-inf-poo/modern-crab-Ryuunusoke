import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Antigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mapa2 extends World
{

    /**
     * Constructor for objects of class Antigo.
     * 
     */
    public Mapa2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Secundario secundario = new Secundario();
        addObject(secundario,229,183);
        DinheiroMenor dinheiroMenor = new DinheiroMenor();
        addObject(dinheiroMenor,453,120);
        dinheiroMenor.setLocation(459,121);
        DinheiroMenor dinheiroMenor2 = new DinheiroMenor();
        addObject(dinheiroMenor2,410,204);
        DinheiroMenor dinheiroMenor3 = new DinheiroMenor();
        addObject(dinheiroMenor3,373,270);
        DinheiroMenor dinheiroMenor4 = new DinheiroMenor();
        addObject(dinheiroMenor4,260,270);
        DinheiroMenor dinheiroMenor5 = new DinheiroMenor();
        addObject(dinheiroMenor5,102,233);
        DinheiroMenor dinheiroMenor6 = new DinheiroMenor();
        addObject(dinheiroMenor6,109,142);
        DinheiroMenor dinheiroMenor7 = new DinheiroMenor();
        addObject(dinheiroMenor7,323,91);
        DinheiroMenor dinheiroMenor8 = new DinheiroMenor();
        addObject(dinheiroMenor8,279,85);
        DinheiroMenor dinheiroMenor9 = new DinheiroMenor();
        addObject(dinheiroMenor9,453,271);
        DinheiroMenor dinheiroMenor10 = new DinheiroMenor();
        addObject(dinheiroMenor10,465,193);
        DinheiroMenor dinheiroMenor11 = new DinheiroMenor();
        addObject(dinheiroMenor11,217,115);
        DinheiroMenor dinheiroMenor12 = new DinheiroMenor();
        addObject(dinheiroMenor12,172,258);
        DinheiroMenor dinheiroMenor13 = new DinheiroMenor();
        addObject(dinheiroMenor13,229,266);
        DinheiroMenor dinheiroMenor14 = new DinheiroMenor();
        addObject(dinheiroMenor14,123,221);
        DinheiroMenor dinheiroMenor15 = new DinheiroMenor();
        addObject(dinheiroMenor15,233,321);
        DinheiroMenor dinheiroMenor16 = new DinheiroMenor();
        addObject(dinheiroMenor16,350,194);
        DinheiroMenor dinheiroMenor17 = new DinheiroMenor();
        addObject(dinheiroMenor17,335,63);
        DinheiroMenor dinheiroMenor18 = new DinheiroMenor();
        addObject(dinheiroMenor18,284,216);
        DinheiroMenor dinheiroMenor19 = new DinheiroMenor();
        addObject(dinheiroMenor19,129,256);
        DinheiroMenor dinheiroMenor20 = new DinheiroMenor();
        addObject(dinheiroMenor20,128,263);
        DinheiroMenor dinheiroMenor21 = new DinheiroMenor();
        addObject(dinheiroMenor21,146,85);
        DinheiroMenor dinheiroMenor22 = new DinheiroMenor();
        addObject(dinheiroMenor22,102,116);
        DinheiroMenor dinheiroMenor23 = new DinheiroMenor();
        addObject(dinheiroMenor23,400,325);
        DinheiroMenor dinheiroMenor24 = new DinheiroMenor();
        addObject(dinheiroMenor24,355,270);
        DinheiroMenor dinheiroMenor25 = new DinheiroMenor();
        addObject(dinheiroMenor25,168,308);
        DinheiroMenor dinheiroMenor26 = new DinheiroMenor();
        addObject(dinheiroMenor26,120,296);
        DinheiroMenor dinheiroMenor27 = new DinheiroMenor();
        addObject(dinheiroMenor27,320,322);
        DinheiroMenor dinheiroMenor28 = new DinheiroMenor();
        addObject(dinheiroMenor28,336,196);
        DinheiroMenor dinheiroMenor29 = new DinheiroMenor();
        addObject(dinheiroMenor29,526,328);
        Worm worm = new Worm();
        addObject(worm,515,129);
        worm.setLocation(577,128);
        Worm worm2 = new Worm();
        addObject(worm2,577,128);
        Worm worm3 = new Worm();
        addObject(worm3,507,254);
        Worm worm4 = new Worm();
        addObject(worm4,486,185);
        Worm worm5 = new Worm();
        addObject(worm5,392,132);
        Worm worm6 = new Worm();
        addObject(worm6,282,232);
        Worm worm7 = new Worm();
        addObject(worm7,121,269);
        Worm worm8 = new Worm();
        addObject(worm8,236,272);
        Worm worm9 = new Worm();
        addObject(worm9,126,121);
        Worm worm10 = new Worm();
        addObject(worm10,127,298);
        Worm worm11 = new Worm();
        addObject(worm11,125,292);
        Worm worm12 = new Worm();
        addObject(worm12,165,110);
        Worm worm13 = new Worm();
        addObject(worm13,150,194);
        Worm worm14 = new Worm();
        addObject(worm14,381,278);
        Worm worm15 = new Worm();
        addObject(worm15,399,201);
        Worm worm16 = new Worm();
        addObject(worm16,298,79);
        Worm worm17 = new Worm();
        addObject(worm17,189,167);
        Worm worm18 = new Worm();
        addObject(worm18,152,341);
        Worm worm19 = new Worm();
        addObject(worm19,233,318);
        Worm worm20 = new Worm();
        addObject(worm20,375,346);
        Worm worm21 = new Worm();
        addObject(worm21,375,341);
        Worm worm22 = new Worm();
        addObject(worm22,345,276);
        Worm worm23 = new Worm();
        addObject(worm23,280,142);
        Worm worm24 = new Worm();
        addObject(worm24,234,140);
        Worm worm25 = new Worm();
        addObject(worm25,438,299);
        Worm worm26 = new Worm();
        addObject(worm26,447,345);
        Worm worm27 = new Worm();
        addObject(worm27,325,189);
        Worm worm28 = new Worm();
        addObject(worm28,307,220);
        Worm worm29 = new Worm();
        addObject(worm29,222,285);
        Worm worm30 = new Worm();
        addObject(worm30,208,349);
        Worm worm31 = new Worm();
        addObject(worm31,500,288);
        Worm worm32 = new Worm();
        addObject(worm32,503,190);
        Worm worm33 = new Worm();
        addObject(worm33,465,84);
        Worm worm34 = new Worm();
        addObject(worm34,393,97);
        Worm worm35 = new Worm();
        addObject(worm35,357,157);
        Worm worm36 = new Worm();
        addObject(worm36,497,299);
        Worm worm37 = new Worm();
        addObject(worm37,497,298);
        Worm worm38 = new Worm();
        addObject(worm38,503,268);
        Worm worm39 = new Worm();
        addObject(worm39,489,84);
        Worm worm40 = new Worm();
        addObject(worm40,446,118);
        Worm worm41 = new Worm();
        addObject(worm41,433,288);
    }
}
