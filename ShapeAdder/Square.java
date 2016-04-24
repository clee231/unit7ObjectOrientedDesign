import java.awt.*; //Graphics2D, Graphics, Rectangle, Color
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
/**
 * gives the square the current color chosen, and places it on the 
 * DrawingPanel.
 * 
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    private double width;
    private Point2D.Double center;
    Color currentColor;
    public Square(Point2D.Double currentCenter, double width, Color color)
    {
        super(currentCenter, width, color);
        this.width= width;
        this.center= currentCenter;
        this.currentColor= color;
        
     
    }
    public void draw(Graphics2D g2, Color color)
    {
        Color shapeColor= color;
        g2.setColor(shapeColor);
        Rectangle2D.Double bounds = new Rectangle2D.Double((int)this.center.getX(),(int)this.center.getY(), this.width, this.width);
        g2.fill(bounds);
        

    }
    public String getType() {
    	return "square";
    }
   }
