import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Novo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Novo extends World
{

    /**
     * Constructor for objects of class Novo.
     * 
     */
    public Novo()
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
        Principal principal = new Principal();
        addObject(principal,252,201);
        Worm worm = new Worm();
        addObject(worm,476,149);
        worm.setLocation(475,152);
        Worm worm2 = new Worm();
        addObject(worm2,475,152);
        Worm worm3 = new Worm();
        addObject(worm3,407,250);
        Worm worm4 = new Worm();
        addObject(worm4,317,268);
        Worm worm5 = new Worm();
        addObject(worm5,171,231);
        Worm worm6 = new Worm();
        addObject(worm6,196,165);
        Worm worm7 = new Worm();
        addObject(worm7,127,193);
        Worm worm8 = new Worm();
        addObject(worm8,114,287);
        Worm worm9 = new Worm();
        addObject(worm9,84,197);
        Worm worm10 = new Worm();
        addObject(worm10,169,97);
        Worm worm11 = new Worm();
        addObject(worm11,277,85);
        Worm worm12 = new Worm();
        addObject(worm12,320,95);
        Worm worm13 = new Worm();
        addObject(worm13,387,167);
        Worm worm14 = new Worm();
        addObject(worm14,478,239);
        Worm worm15 = new Worm();
        addObject(worm15,483,283);
        Worm worm16 = new Worm();
        addObject(worm16,503,318);
        DinheiroMenor dinheiroMenor = new DinheiroMenor();
        addObject(dinheiroMenor,443,99);
        DinheiroMenor dinheiroMenor2 = new DinheiroMenor();
        addObject(dinheiroMenor2,445,100);
        DinheiroMenor dinheiroMenor3 = new DinheiroMenor();
        addObject(dinheiroMenor3,514,118);
        DinheiroMenor dinheiroMenor4 = new DinheiroMenor();
        addObject(dinheiroMenor4,526,184);
        DinheiroMenor dinheiroMenor5 = new DinheiroMenor();
        addObject(dinheiroMenor5,532,148);
        DinheiroMenor dinheiroMenor6 = new DinheiroMenor();
        addObject(dinheiroMenor6,494,212);
        DinheiroMenor dinheiroMenor7 = new DinheiroMenor();
        addObject(dinheiroMenor7,276,301);
        DinheiroMenor dinheiroMenor8 = new DinheiroMenor();
        addObject(dinheiroMenor8,323,293);
        DinheiroMenor dinheiroMenor9 = new DinheiroMenor();
        addObject(dinheiroMenor9,370,233);
        DinheiroMenor dinheiroMenor10 = new DinheiroMenor();
        addObject(dinheiroMenor10,162,185);
        DinheiroMenor dinheiroMenor11 = new DinheiroMenor();
        addObject(dinheiroMenor11,216,273);
        DinheiroMenor dinheiroMenor12 = new DinheiroMenor();
        addObject(dinheiroMenor12,224,283);
        DinheiroMenor dinheiroMenor13 = new DinheiroMenor();
        addObject(dinheiroMenor13,185,282);
        DinheiroMenor dinheiroMenor14 = new DinheiroMenor();
        addObject(dinheiroMenor14,134,222);
        DinheiroMenor dinheiroMenor15 = new DinheiroMenor();
        addObject(dinheiroMenor15,103,79);
        DinheiroMenor dinheiroMenor16 = new DinheiroMenor();
        addObject(dinheiroMenor16,103,99);
        Worm worm17 = new Worm();
        addObject(worm17,464,359);
        worm17.setLocation(457,353);
        Worm worm18 = new Worm();
        addObject(worm18,457,353);
        Worm worm19 = new Worm();
        addObject(worm19,399,327);
        Worm worm20 = new Worm();
        addObject(worm20,153,354);
        Worm worm21 = new Worm();
        addObject(worm21,74,298);
        Worm worm22 = new Worm();
        addObject(worm22,49,125);
        Worm worm23 = new Worm();
        addObject(worm23,153,38);
        Worm worm24 = new Worm();
        addObject(worm24,344,33);
        Worm worm25 = new Worm();
        addObject(worm25,478,34);
        Worm worm26 = new Worm();
        addObject(worm26,558,192);
        Worm worm27 = new Worm();
        addObject(worm27,548,311);
        Worm worm28 = new Worm();
        addObject(worm28,341,358);
        Worm worm29 = new Worm();
        addObject(worm29,312,194);
        Worm worm30 = new Worm();
        addObject(worm30,254,124);
        Worm worm31 = new Worm();
        addObject(worm31,407,92);
        Worm worm32 = new Worm();
        addObject(worm32,390,43);
        Worm worm33 = new Worm();
        addObject(worm33,252,28);
        Worm worm34 = new Worm();
        addObject(worm34,93,120);
        Worm worm35 = new Worm();
        addObject(worm35,233,322);
        Worm worm36 = new Worm();
        addObject(worm36,258,365);
        worm20.setLocation(159,324);
        Worm worm37 = new Worm();
        addObject(worm37,159,324);
        Worm worm38 = new Worm();
        addObject(worm38,27,352);
        Worm worm39 = new Worm();
        addObject(worm39,65,241);
        worm13.setLocation(358,188);
        Worm worm40 = new Worm();
        addObject(worm40,358,188);
        Worm worm41 = new Worm();
        addObject(worm41,447,186);
        Worm worm42 = new Worm();
        addObject(worm42,358,117);
        DinheiroMenor dinheiroMenor17 = new DinheiroMenor();
        addObject(dinheiroMenor17,537,67);
        dinheiroMenor17.setLocation(532,68);
        DinheiroMenor dinheiroMenor18 = new DinheiroMenor();
        addObject(dinheiroMenor18,532,68);
        DinheiroMenor dinheiroMenor19 = new DinheiroMenor();
        addObject(dinheiroMenor19,483,100);
        DinheiroMenor dinheiroMenor20 = new DinheiroMenor();
        addObject(dinheiroMenor20,426,154);
        DinheiroMenor dinheiroMenor21 = new DinheiroMenor();
        addObject(dinheiroMenor21,421,219);
        DinheiroMenor dinheiroMenor22 = new DinheiroMenor();
        addObject(dinheiroMenor22,439,259);
        worm19.setLocation(419,307);
        DinheiroMenor dinheiroMenor23 = new DinheiroMenor();
        addObject(dinheiroMenor23,419,307);
        DinheiroMenor dinheiroMenor24 = new DinheiroMenor();
        addObject(dinheiroMenor24,403,357);
        DinheiroMenor dinheiroMenor25 = new DinheiroMenor();
        addObject(dinheiroMenor25,357,295);
        worm3.setLocation(382,266);
        DinheiroMenor dinheiroMenor26 = new DinheiroMenor();
        addObject(dinheiroMenor26,382,266);
        DinheiroMenor dinheiroMenor27 = new DinheiroMenor();
        addObject(dinheiroMenor27,373,337);
    }
}
