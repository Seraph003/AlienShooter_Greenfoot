import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int ms = 0;
    GreenfootSound blast;
    
    public Explosion () {
        blast = new GreenfootSound("sounds/blast.wav");
        blast.setVolume(70);
        blast.play();
    }
    
    public void act()
    {
        // Add your action code here.
        ms++;
        if (ms == 60) {
            getWorld().removeObject(this);
        }
    }
}
