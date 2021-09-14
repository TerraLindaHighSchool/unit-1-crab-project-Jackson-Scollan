import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Person person = new Person();
        addObject(person,238,202);
        Gold gold = new Gold();
        addObject(gold,61,191);
        Gold gold2 = new Gold();
        addObject(gold2,427,252);
        Gold gold3 = new Gold();
        addObject(gold3,155,383);
        Gold gold4 = new Gold();
        addObject(gold4,402,451);
        Gold gold5 = new Gold();
        addObject(gold5,476,41);
        Gold gold6 = new Gold();
        addObject(gold6,68,515);
        gold3.setLocation(195,390);
        gold4.setLocation(409,471);
        gold3.setLocation(184,366);
        gold6.setLocation(163,513);
        gold6.setLocation(111,510);
        gold4.setLocation(326,476);
        Gold gold7 = new Gold();
        addObject(gold7,167,68);
        Gold gold8 = new Gold();
        addObject(gold8,437,394);
        gold4.setLocation(324,502);
        Alligator alligator = new Alligator();
        addObject(alligator,481,92);
        Alligator alligator2 = new Alligator();
        addObject(alligator2,353,344);
        Alligator alligator3 = new Alligator();
        addObject(alligator3,180,97);
        Alligator alligator4 = new Alligator();
        addObject(alligator4,172,458);
        removeObject(alligator3);
        removeObject(alligator);
        removeObject(alligator2);
        removeObject(alligator4);

        Alligator alligator5 = new Alligator();
        addObject(alligator5,100,147);
        Alligator alligator6 = new Alligator();
        addObject(alligator6,112,464);
        alligator5.setLocation(107,99);
        person.setLocation(268,232);
        AlligatorVer alligatorVer = new AlligatorVer();
        addObject(alligatorVer,427,119);
        AlligatorVer alligatorVer2 = new AlligatorVer();
        addObject(alligatorVer2,435,484);
        person.setLocation(286,292);
        person.setLocation(287,323);
    }
}