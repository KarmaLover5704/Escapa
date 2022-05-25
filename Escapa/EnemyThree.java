import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyThree extends Enemy
{
    public EnemyThree()
    {
        deltaX = -speed;
        deltaY = -speed;
        
        width = 80;
        height = 140;
        
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
}
