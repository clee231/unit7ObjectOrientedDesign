import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends JFrame
{
    private static final int FRAME_WIDTH= 250;// in pixels
    private static final int FRAME_HEIGHT= 200;
    
    private int point1;
    private int point2;
    private int point3;
    
    private JFrame frame;
    /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {      
        this.frame= new JFrame();
        MousePressListener listener= new MousePressListener();
        
        
        
        
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
        public void mousePress(MouseEvent event)
        {
            int x= event.getX();
            int y= event.getY();
        }
        void mouseReleased(MouseEvent event);
        void mouseClicked(MouseEvent event);
        void mouseEntered(MouseEvent event);
        void mouseExited(MouseEvent event);
    }

}
