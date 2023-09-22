import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Backgrounds
{
    int gravity =1;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    
    public int getGravity(){
        return this.gravity;
    }
    
    public Background()
    {
       Player yoga = new Player();
        this.addObject(yoga, 300, 200);
        this.gravity = 1;
       Player yoga2 = new Player();
        this.addObject(yoga2, 400, 0);
    }
    
    public void act(){
        List<Character> allchars = this.getObjects(Character.class);
        for(Character chara : allchars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }
}    
