import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
/**
 * gives the square the current color chosen, and places it on the 
 * DrawingPanel.
 * 
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    public Square()
    {
     super();
    }
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.YELLOW);
    }
    public void resize()
    {
    }
    
   }
