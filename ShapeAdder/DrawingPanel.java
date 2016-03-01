import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JComponent;

/**
 * This is where most of the work is done. 
 * This class is a subclass of JPanel and it implements the MouseListener, MouseMotionListener, and KeyListener interfaces
 * (or extends the associated adapters). In the DrawingPanel constructor, add this panel to itself as these three listeners.
 * (If you prefer, implement the three listeners in private inner classes and add them to this panel).

 * A DrawingPanel maintains a list of shapes (an ArrayList<Shape>) and a reference to the “active shape.” 
 * The latter refers to the last added shape or the shape last picked with a mouse (a shape is “picked” when the mouse clicks inside of it or on its border). 
 * DrawingPanel should also have an enum field or boolean fields that indicate whether a shape is currently picked and, if so, whether it is being moved or stretched.

 * DrawingPanel’s constructor and some of the methods are summarized in Table 1. 
 * The methods that implement the requirements of the MouseListener, MouseMotionListener, and KeyListener interfaces are not shown.
 * Of these only mousePressed, mouseDragged, and keyPressed are used.
 * Don’t forget to call repaint after adding a shape and whenever one of the listener methods changes the appearance of the picture.
 * 
 * @author (Bryce Lee) 
 * @version (2/24/2016)
 */
public class DrawingPanel //implements MouseMotionListener, MouseListener, KeyListener
{
    Square squareShape;
    Circle circleShape;
    ArrayList<Shape> shapeList;
    Color defaultColor;
    int choice;
    public DrawingPanel()
    {
            Square squareShape= new Square();
            Circle circleShape= new Circle();
            ArrayList<Shape> shapeList= new ArrayList<Shape>();
            Color defaultColor=new Color(0,0,0);

    }

    public Color getColor()
    {
        return defaultColor;
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(400,400);
    }

    public void pickColor()
    {
        // we want to use the get color method first, then set the default color to the 
        defaultColor=JColorChooser.showDialog(null, "Choose a color", defaultColor);
       
    }

    public void addCircle()
    {
        this.choice=1;
    }

    public void addSquare()
    {
        this.choice=2;

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (this.choice==1)
        {
            circleShape.draw(g2);
        }
        else if (this.choice==2)
        {
            squareShape.draw(g2);
        }

    }
 
}
