import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
/**
 * ControlPanel extends JPanel.
 * Add three buttons to it: “Pick Color,” “Add Circle,” and “Add Square.” 
 * Add a JPanel after the “Pick Color” button; its purpose is
 * to show the currently selected color. 
 * Call canvas’s getColor method to obtain the initial color. 
 * Attach the appropriate listener to the “Pick Color,” “Add Circle,” and “Add Square” buttons, using the control panel itself as a listener,
 * or, if you prefer, inner action listener classes, or anonymous inline classes.
 * When “Pick Color” is clicked, call canvas’s pickColor method, then get the selected color back from canvas and show that color on the color display button.
 * When “Add Circle” or “Add Square” is clicked, call canvas’s addCircle or addSquare method. 
 * Extension: Don’t forget to return the keyboard focus to canvas in either event (read about JComponent’s requestFocusInWindow method).
 * 
 * @author (Bryce Lee) 
 * @version (a version number or a date)
 */
public class ControlPanel  extends JPanel 
{
   //no need to worry about where this is located. DrawEditor set this
   // panel to the south already.
   JButton squareButton;
   JButton circleButton;
   JButton pickColor;
   DrawingPanel drawPan;
   
   public ControlPanel(DrawingPanel canvas)
   {
       this.squareButton= new JButton("Add Square");
       this.circleButton= new JButton("Add Circle");
       this.pickColor= new JButton("Choose Color");
       this.drawPan= new DrawingPanel();
       JPanel colorPanel= new JPanel();
       Color chosenColor = new Color(0,0,0);
       
       this.add(squareButton);
       this.add(circleButton);
       
       colorPanel.setBackground(chosenColor);
       this.add(pickColor);
       this.add(colorPanel);
       
       
       ClickListener listener= new ClickListener();
       squareButton.addActionListener(listener);
       circleButton.addActionListener(listener);
       pickColor.addActionListener(listener);

   }
   public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
           if( event.getActionCommand()== "Add Square")
           {
               System.out.println("square");
           }
           else if( event.getActionCommand()== "Add Circle")
           {
            System.out.println("o");   
           }
           else 
           {
               drawPan.pickColor();   
           }
        }

    }
    
}
