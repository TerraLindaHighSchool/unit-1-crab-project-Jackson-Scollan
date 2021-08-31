import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lobster is the enemy of the crabb
 * 
 * @author Jackson Scollan 
 * @version 8-31-21
 */
public class Lobster extends Actor
{
// This method repeats the following actions
    public void act()
    {
        move(3);
        turnAtEdge();
    }

// Turn Crab at the edge
private void turnAtEdge()
{
    if(isAtEdge())
    {
        turn(50);
    }
}

}
