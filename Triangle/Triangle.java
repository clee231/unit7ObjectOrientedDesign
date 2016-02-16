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
        }
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }

}
