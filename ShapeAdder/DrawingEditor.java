import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
/**
 * The DrawingEditor class extends JFrame.  --
 * In the DrawingEditor’s constructor display “Drawing Editor” in the title bar.
 * Create a DrawingPanel canvas and a ControlPanel controls, 
 * passing canvas to the ControlPanel’s constructor as a parameter 
 * (so that controls knows what it controls). 
 * Attach canvas and controls to the appropriate regions of the JFrame’s content pane
 * (read about the BorderLayout class for specifics). 
 * To complete the DrawingEditor class, provide a standard main method
 * that creates a new DrawingEditor object which opens a window on the screen.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
  public final static int WIDTH= 500;
  public final static int HEIGHT= 500;

  public DrawingEditor()
  { 
  
     DrawingPanel canvas= new DrawingPanel();
     ControlPanel controls= new ControlPanel(canvas);
    
     BorderLayout layout= new BorderLayout();
     //making the objects
     
     this.setSize(WIDTH,HEIGHT);
     this.add(controls, layout.SOUTH);
     this.add(canvas, layout.CENTER);
     // adding the objects to the canvas

    
     this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
     //things needed to make the window
  }
  
  
  public static void main (String[] args)
  {
   DrawingEditor draw= new DrawingEditor();   
  }
}
