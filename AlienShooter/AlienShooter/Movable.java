import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movable extends Actor
{
    /**
     * Act - do whatever the Movable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void moveHorizontal(int distance){
        setLocation(getX() + distance, getY());
    }
    
    public void moveVertical(int distance) {
        setLocation(getX(), getY() + distance);
    }
    
}
