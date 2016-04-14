import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    private double radius;
    private Point2D.Double center;
    Color currentColor;
    
    public Circle(Point2D.Double currentCenter, double width, Color color)
    {
        super(currentCenter, width, color);
        this.radius= width;
        this.center= currentCenter;
        this.currentColor= color;
        
        
    }
    public void draw(Graphics2D g2)
    {
        //Ellipse2D circle = new Ellipse2D.Double(0, 0, super.radius,super.radius);
        g2.drawOval((int)this.center.getX(),(int)this.center.getY(), 60, 60);
    }
    public void resize()
    {
    }
   }
