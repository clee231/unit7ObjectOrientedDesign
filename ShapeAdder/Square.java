import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Random;
/**
 * gives the square the current color chosen, and places it on the 
 * DrawingPanel.
 * 
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    Random gen= new Random(100);
    
    public Square()
    {
     super();
     
    }
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.black);
        // These Rectangles will be the Outline of the buildings
        Rectangle2D.Double bounds = new Rectangle2D.Double(10, 10, 50, 50);

        // Fills the bounds with black
        g2.fill(bounds);

    }
    public void resize()
    {
    }
    
   }
