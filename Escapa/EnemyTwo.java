import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTwo extends Enemy
{
    public EnemyTwo()
    {
        deltaX = -speed;
        deltaY = speed;
        
        width = 200;
        height = 40;
        
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
    
    public void act()
    {
        if (getY() > getWorld().getHeight() - height/2)
        {
            System.out.println("Long Enemy: Reached bottom. Bounce up.");
            deltaY = -speed;
        }
        
        if (getY() < height/2)
        {
            System.out.println("Long enemy: Reached top. Bounce down.");
            deltaY = speed;
        }
        
        if (getX() > getWorld().getWidth() - width/2)
        {
            System.out.println("Long enemy: Reached right. Bounce left.");
            deltaX = -speed;
        }
        
        if (getX() < width/2)
        {
            System.out.println("Long enemy: Reached left. Bounce right.");
            deltaX = speed;
        }
        
        // Update location.
        setLocation(getX() + deltaX, getY() + deltaY);
    }
}
