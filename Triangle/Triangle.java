import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

// need a class that will keep track of the points and draw them in. (ie Cityscape)
/**
 * Draws a triangle using the GUI to pick the 3 points on the given screen size
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public class Triangle extends JFrame
{
    private static final int FRAME_WIDTH= 500;
    private static final int FRAME_HEIGHT= 500;
    // For the Window Size
   
    private JFrame frame;
    // For  the components of the frame
    private int clicks=0;
    //for all points
    private int x1;
    private int x2;
    private int x3;
    
    private int y1;
    private int y2;
    private int y3;
    /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {      
        this.frame= new JFrame();
        MousePressListener listener= new MousePressListener();
        this.frame.addMouseListener(listener);
        
        TriangleDraw draw= new TriangleDraw();
        this.frame.add(draw);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        
      
    }
    public void setPoints(int x, int y)
    {
        this.clicks++;
         if (clicks==1)
        {
            x1= x;
            y1= y;
        }
         if (clicks==2)
        {
            x2= x;
            y2= y;
        }
         if (clicks==3)
        {
            x3= x;
            y3= y;
        }
        if (clicks==4)
        {
                // need to set points all to nothing, 0 won't work.
                this.clicks=0;
        }
    }
    
    public static void main (String[]args)
    {
        Triangle tri= new Triangle();
    }
    
  
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event){ }
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event)
        {
            int x= event.getX();
            int y= event.getY();
            //Triangle.setPoints(x,y);
            
        }
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }

}
