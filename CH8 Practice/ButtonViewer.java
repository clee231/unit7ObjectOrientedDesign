import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonViewer
{
    private static final int FRAME_WIDTH= 250;// in pixels
    private static final int FRAME_HEIGHT= 200;

    private JFrame frame;// Frames can only have one component
    private JButton button;
    private JButton button2;
    private JPanel panel;
    private JLabel label;

    public ButtonViewer()
    {
        this.frame= new JFrame();
        this.panel= new JPanel();
        this.button= new JButton("Click for likes ");

        this.label= new JLabel();
        this.panel.add(this.label);
        this.panel.add(this.button);
        // We put the buttons in the panel, then we add it to frame
        this.button2= new JButton("Click for Subs ");
        this.panel.add(this.button2);
        this.frame.add(panel);

        ClickListener listener= new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main (String[] args)
    {
        ButtonViewer view= new ButtonViewer();
    }

    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {

            //System.out.println("Button" + event.getActionCommand()+ "was clicked");
            label.setText("Button " + event.getActionCommand()+ " was clicked");
        }

    }
}