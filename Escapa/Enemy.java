import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int speed;
    int width;
    int height;
    int deltaX;
    int deltaY;
    
    public Enemy()
    {
        speed = 4;
        width = 100;
        height = 100;
        deltaX = speed;
        deltaY = speed;
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() > getWorld().getHeight() - height/2)
        {
            deltaY = -speed;
        }
        
        if (getY() < height/2)
        {
            deltaY = speed;
        }
        
        if (getX() > getWorld().getWidth() - width/2)
        {
            deltaX = -speed;
        }
        
        if (getX() < width/2)
        {
            deltaX = speed;
        }
        
        // Update location.
        setLocation(getX() + deltaX, getY() + deltaY);
    }
}
