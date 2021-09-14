import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @auther Jackson Scollan
 * @version 9/8/21
 */
public class Person extends Actor
{
 private int numOfGolds = 8;
 // This method repeats the following actions 
 public void act()
    {
        move(0);
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
    if(Greenfoot.isKeyDown("up"))
    {
        setLocation(getX(), getY() - 7);
    }
   
    if(Greenfoot.isKeyDown("down"))
    {
        setLocation(getX(), getY() + 7);
    }
    
    if(Greenfoot.isKeyDown("right"))
    {
        setLocation(getX() +7, getY() );
    }
   
    if(Greenfoot.isKeyDown("left"))
    {
        setLocation(getX() -7, getY() );
    }
    
}


//Checks for collisions with other objects
private void onCollision()
{
    if(isTouching(Gold.class))
    {
        removeTouching(Gold.class);
        Greenfoot.playSound("cashregister.mp3");
        numOfGolds--;
        
        //Winning the game
        if (numOfGolds == 0)
        {
            Greenfoot.setWorld(new WinSplash());
            Greenfoot.playSound("cheer2.mp3");
            Greenfoot.stop();
        }
    }
    
    if(isTouching(Alligator.class))
    {
        Greenfoot.setWorld(new GameOverScreen());
        Greenfoot.playSound("gameover.mp3");
        Greenfoot.stop();
    }
    
     if(isTouching(AlligatorVer.class))
    {
        Greenfoot.setWorld(new GameOverScreen());
        Greenfoot.playSound("gameover.mp3");
        Greenfoot.stop();
    }
}

}