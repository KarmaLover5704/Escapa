import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        PlayerOne player = new PlayerOne();
        addObject(player, getWidth()/2, getHeight()/2);
        addObject(new Enemy(), 100, 100);
        addObject(new EnemyTwo(), 500, 100);
        addObject(new EnemyThree(), 500, 300);
    }
}
