import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Alligator is the enemy of the Person
 * 
 * @author Jackson Scollan 
 * @version 8-31-21
 */
public class Alligator extends Actor
{

    public void act()
    {
        move(5);
        turnAtEdge();
    }

// Turn Crab at the edge
private void turnAtEdge()
{
    if(isAtEdge())
    {
        turn(150);
    }
}

}
