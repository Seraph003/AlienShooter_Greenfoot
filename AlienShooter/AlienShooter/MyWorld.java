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
    public static Counter counterScore;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    
    public void prepare() {
        for (int i = 0; i < 5; i++) {
            Alien alien = new Alien();
            addObject(alien, Greenfoot.getRandomNumber(getWidth()), 0);
        }
        
        Rocket rocket = new Rocket();
        addObject(rocket, getWidth()/2, getHeight() * 4 / 5);
        
        counterScore = new Counter("Score : ");
        addObject(counterScore, 50, 20);
    }
}
