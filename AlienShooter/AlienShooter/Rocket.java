import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Movable
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    int ms = 0;
    
    public void act()
    {
        // Add your action code here.
        keyboardControl();
        shoot();
        dieIfHitByAlien();
    }
    
    public void keyboardControl() {
        if (Greenfoot.isKeyDown("up")) {
            moveVertical(-speed);
        }
        
        else if (Greenfoot.isKeyDown("down")) {
            moveVertical(speed);
        }
        
        else if (Greenfoot.isKeyDown("right")) {
            moveHorizontal(speed);
        }
        
        else if (Greenfoot.isKeyDown("left")) {
            moveHorizontal(-speed);
        }
    }

    public void shoot() {
        ms++;
        if (ms == 60) {
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            
            ms = 0;
            
            Greenfoot.playSound("sounds/ammo.wav");
        }
    }
    
    public void dieIfHitByAlien() {
        if (isTouching(Alien.class)) {
            Explosion expl = new Explosion();
            getWorld().addObject(expl, getX(), getY());
            
            getWorld().addObject(new GameOver(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
