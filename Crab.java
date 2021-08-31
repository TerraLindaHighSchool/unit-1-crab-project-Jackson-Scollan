import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @auther Jackson Scollan
 * @version 8/26/21
 */
public class Crab extends Actor
{
 // This method repeats the following actions 
 public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }

// Turn Crab at the edge
private void turnAtEdge()
{
    if(isAtEdge())
    {
        turn(50);
    }
}

// Checks for user key presses so user can tun the Crab
private void checkKeyPress()
{
    if(Greenfoot.isKeyDown("right"))
    {
        turn(5);
    }
    
    if(Greenfoot.isKeyDown("left"))
    {
        turn(-5);
    }

}

//Checks for collisions with other objects
private void onCollision()
{
    if(isTouching(Worm.class))
    {
        removeTouching(Worm.class);
        Greenfoot.playSound("slurp.wav");
    }
    
    if(isTouching(Lobster.class))
    {
        Greenfoot.playSound("au.wav");
        Greenfoot.stop();
    }

}

}