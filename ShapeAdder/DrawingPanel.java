import java.awt.event.*; // this imports the MouseEvent, MouseListener, KeyListener, MouseMotionListener, etc...
import java.awt.*;// Color, Dimension, Graphics2D, Graphics
import java.util.ArrayList;
import java.util.Random;
import java.awt.geom.Point2D;
import javax.swing.*; //JColorChooser, Jcomponent, JPanel
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
    double width;
    //
    int positionX;
    int positionY;
    //
    Point2D.Double center;
    Random random;
    public DrawingPanel()
    {
        Square squareShape= new Square(center,width,chosenColor);
        Circle circleShape= new Circle(center,width,chosenColor);
        this.shapeList= new ArrayList<Shape>();
        Color chosenColor=new Color(0,0,0);
        MousePressListener mListener= new MousePressListener();
        this.setBackground(Color.WHITE);
        this.addMouseListener(mListener);
        this.random = new Random();

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
        Point2D.Double curCent = new Point2D.Double(positionX, positionY);
        Circle addCircle= new Circle(curCent,60,chosenColor);
        this.shapeList.add(addCircle);
        System.out.println("Size of shapeList:" + shapeList.size());
        //this.nextFrame();
        //repaint();
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
        Point2D.Double curCent = new Point2D.Double(positionX, positionY);
        Square addSquare = new Square(curCent,60,chosenColor);
        shapeList.add(addSquare);
        System.out.println("In addSquare");
        //repaint();

    }

    /**
     * This method redraws all the shapes in the ArrayList shapeList.
     * @param  takes a parameter of Graphics g.
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //g2.drawOval(positionX, positionY, 60, 60);
        //if (this.choice==1)
        //{
        //    circleShape.draw(g2);
        //    System.out.println("Circle");
        //}
        //else if (this.choice==2)
        //{
        //    squareShape.draw(g2, chosenColor);
        //    System.out.println("Square");
        //}
        for(Shape cur : shapeList) {
        	if (cur instanceof Circle) {
        		((Circle)cur).draw(g2);
        	}else {
        		((Square)cur).draw(g2,chosenColor);
        	}
        }
    }

    /**
     * This method calls repaint to then call paintComponent to redraw all shapes.
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
            Point2D.Double center = new Point2D.Double( positionX, positionY );
            repaint();
            System.out.println(center);
            //Triangle.setPoints(x,y);
        }

        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        public void mouseMoved( MouseEvent event){}
        public void mouseDragged(MouseEvent event) {
            // will use
        }

        public void keyPressed(KeyEvent event){
            // will use
        }

        public void keyReleased(KeyEvent event){}
        public void keyTyped(KeyEvent event){}
    }

}
