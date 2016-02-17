import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

/**
 * Draws the triangle with the 3 given points
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleDraw extends JComponent 
{
   
    
    /**
     *@param    g2 the graphics context
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        
    }
    public void drawPoint (Graphics2D g2, int x, int y)
    {
      //this will draw a point on the screen
      Ellipse2D ellipse = new Ellipse2D.Double();
      g2.draw(new Ellipse2D.Double(x,y,x+2,y+2)); // need to be specific
    }
    public void line(Graphics2D g2)
    {
        //will draw the lines when clicked
        Line2D line= new Line2D.Double();
    }
    public void nextFrame()
    {
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }
}
