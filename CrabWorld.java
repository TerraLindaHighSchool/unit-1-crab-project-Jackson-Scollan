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
        Crab crab = new Crab();
        addObject(crab,238,202);
        Worm worm = new Worm();
        addObject(worm,61,191);
        Worm worm2 = new Worm();
        addObject(worm2,427,252);
        Worm worm3 = new Worm();
        addObject(worm3,155,383);
        Worm worm4 = new Worm();
        addObject(worm4,402,451);
        Worm worm5 = new Worm();
        addObject(worm5,476,41);
        Worm worm6 = new Worm();
        addObject(worm6,68,515);
        worm3.setLocation(195,390);
        worm4.setLocation(409,471);
        worm3.setLocation(184,366);
        worm6.setLocation(163,513);
        worm6.setLocation(111,510);
        worm4.setLocation(326,476);
        Worm worm7 = new Worm();
        addObject(worm7,167,68);
        Worm worm8 = new Worm();
        addObject(worm8,437,394);
        worm4.setLocation(324,502);
    }
}