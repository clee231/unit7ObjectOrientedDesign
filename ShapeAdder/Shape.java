import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
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
    private double radius;
    private double width;
    private int centerX;
    private int centerY;
    private Point2D.Double trueCenter;
    Color currentColor;
    //Note that we are making a square, so both width and height are the same.
    public Shape(Point2D.Double center, Color color)
    {
       // Do not know how to use Point2D.Double...
       //this.radius =radius;
       this.width= width;
       this.currentColor= new Color(0,0,0);
       this.trueCenter= center;
    }
    
    public Point2D.Double getCenter()
     {
         return trueCenter;
     }
     
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double r)
    {
        this.radius= r;
    }
    
    public void draw(Graphics2D g2)
    {
        // this is just temp. We will need to grab the color of shape when clicked
    }
    
    public void resize()
    {
    }
    
}
