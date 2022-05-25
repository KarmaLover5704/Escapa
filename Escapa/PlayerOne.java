import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOne extends Actor
{
    SimpleTimer timer;      // Utility object inside actor that keeps time.
    
    public PlayerOne()
    {
        timer = new SimpleTimer();      // Initialize timer.
        timer.mark();                   // Start timer.
    }
    
    /**
     * Act - do whatever the PlayerOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Movement:
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 10);
        }
        
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 10);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 10, getY());
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 10, getY());
        }
        
        
        // Collision detection:
        
        if (isTouching(Enemy.class))
        {
            // Show time elapsed.
            getWorld().showText(timer.millisElapsed() + "milliseconds", getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            // Reset position.
            // setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            Greenfoot.stop();
        }
    }
}
