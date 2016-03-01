import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
/**
 * This abstract class implements a shape with a given center, radius, and color.
 * Its constructor and methods are summarized in Table 2.

 * Thoroughly test all the mouse and keyboard action in your program.
 * 
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    private int radius;
    private int width;
    private int center;
    //Note that we are making a square, so both width and height are the same.
    public Shape()
    {
       this.radius =50;
       this.width= 70;
       this.center= 250;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.YELLOW); 
        // this is just temp. We will need to grab the color of shape when clicked
    }
    
    public void resize()
    {
    }
    
}
