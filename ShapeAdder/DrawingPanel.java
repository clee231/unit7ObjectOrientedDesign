import java.awt.event.*; // this imports the MouseEvent, MouseListener, KeyListener, MouseMotionListener, etc...
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JPanel;
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
public class DrawingPanel extends JPanel 
{
    Square squareShape;
    Circle circleShape;
    ArrayList<Shape> shapeList;
    Color chosenColor;
    int choice;
    int positionX;
    int positionY;
    public DrawingPanel()
    {
        Square squareShape= new Square();
        Circle circleShape= new Circle();
        ArrayList<Shape> shapeList= new ArrayList<Shape>();
        Color chosenColor=new Color(0,0,0);
        MousePressListener mListener= new MousePressListener();
        this.setBackground(Color.WHITE);
        this.addMouseListener(mListener);

    }

    /**
     * This method returns the current color.
     *
     * @return     The color chosen by the user.
     */
    public Color getColor()
    {
        return chosenColor;
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(400,400);
    }

    /**
     * This method allows the user to choose a color, then after chosen, the panel will change colors.
     *
     */public void pickColor()
    {
        // we want to use the get color method first, then set the default color to the 
        chosenColor=JColorChooser.showDialog(null, "Choose a color", chosenColor);

    }

    /**
     * This method is calling the nextFrame method to call paintComponent to draw a circle.
     *
     * @param Called from ControlPanel. Parameter of color, to color the circle.
     */
    public void addCircle(Color currentColor)
    {
        this.choice=1;
        chosenColor = currentColor;
        System.out.println("In addCircle");
        //shapeList.add(circleShape);
        //this.nextFrame();
    }

    /**
     * This method is calling the nextFrame to call paintComponent to draw a square. 
     *
     * @param  Called from ControlPanel. Parameter of color, in order to color the square shape. 
     *          
     */
    public void addSquare(Color currentColor)
    {
        this.choice=2;
        chosenColor = currentColor;
        //shapeList.add(squareShape);
        System.out.println("In addSquare");
        //this.nextFrame();

    }

    /**
     * This method redraws all the shapes in the ArrayList shapeList.
     * @param  takes a parameter of Graphics g.
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(40, 40, 60, 60);
        if (this.choice==1)
        {
            circleShape.draw(g2);
            System.out.println("Circle");
        }
        else if (this.choice==2)
        {
            squareShape.draw(g2, chosenColor);
            System.out.println("Square");
        }
    }

    /**
     * This method calls repaint to then call paintComponent to redraw all shapes.
     *
     * 
     */
    public void nextFrame()
    {
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        this.repaint();
        System.out.println("In nextFrame");
    }
    public class MousePressListener implements MouseListener, MouseMotionListener, KeyListener
    {
        public void mousePressed(MouseEvent event){
            positionX= event.getX();
            positionY= event.getY();

            repaint();
            System.out.println(positionX);
            //Triangle.setPoints(x,y);
        }

        public void mouseReleased(MouseEvent event){}

        public void mouseClicked(MouseEvent event) {}

        public void mouseEntered(MouseEvent event){}

        public void mouseExited(MouseEvent event){}

        public void mouseDragged(MouseEvent event) {
            // will use
        }

        public void mouseMoved( MouseEvent event){ }

        public void keyPressed(KeyEvent event){
            // will use
        }

        public void keyReleased(KeyEvent event){}

        public void keyTyped(KeyEvent event){}
    }

}
