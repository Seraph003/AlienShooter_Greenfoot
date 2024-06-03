import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Movable
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    
    // Alien alien = new Alien();
    
    public Alien () {
        setImage("Alien" + Greenfoot.getRandomNumber(6) + ".png");
    }
    
    public void act()
    {
        // Add your action code here.
        moveVertical(speed);
        returnToTop();
        dieIfHitByBullet();
    }
    
    public void returnToTop(){
        if (getY() == getWorld().getHeight() - 1) {
            setLocation(getX(), 0);
        }
    }
    
    public void dieIfHitByBullet() {
        if (isTouching(Bullet.class)) {
            Explosion expl = new Explosion();
            getWorld().addObject(expl, getX(), getY());
            
            Bullet bulletHit = (Bullet) getIntersectingObjects(Bullet.class).get(0);
            getWorld().removeObject(bulletHit);
            
            Alien alien = new Alien();
            getWorld().addObject(alien, Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            
            MyWorld.counterScore.add(10);
            
            getWorld().removeObject(this);
        }
    }
}
