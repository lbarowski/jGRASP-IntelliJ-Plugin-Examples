
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * ComponentExample - This example is intended to illustrate the capabilities
 * of the jGRASP viewers for the Components. 
 * 
 * Click the "Run in Canvas" button on the toolbar. Then on the canvas window,
 * click the "Play" button. Click the "Pause" button after the window pops up
 * but before control reaches the end of main(). Ajust the size of the frame
 * that pops up to see the effect on the frame viewer. Select the frame viewer
 * then move the mouse across the windows shown there to see information about
 * the window under the mouse and all its ancestors.
 * 
 * For IntelliJ, in order to see the viewer update in real time as the window
 * is resized, you must set a breakpoint in the pause loop at the end, right
 * click on the breakpoint, and set "Suspend" to "Thread" instead of "All".
 *
 * To end the program, click the "Stop" button on the canvas or click the
 * "End" button on the Run I/O tab.
 *
 * To create your own canvas, click the "Run in Canvas" button or set a
 * breakpoint and click the "Debug" button. Then on the Debug tab click the
 * "Open Canvas" button. Click "Step" or "Step-in" until you see objects or
 * primitives of interest in the Debug Variables tab, then drag them onto the
 * canvas. Arrange and click the "Play" button. Alternatively, you can click
 * the "Step" and Step-in" buttons.
 */
public class ComponentExample {

   public static void main(String[] args) {
      JPanel panel = new JPanel(new BorderLayout(5, 5));
      JLabel l1 = new JLabel(" ");
      l1.setOpaque(true);
      panel.add(l1, "South");
      JPanel center = new JPanel();
      center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));
      panel.add(center, "Center");
      JLabel l2 = new JLabel("1");
      l2.setOpaque(true);
      JLabel l3 = new JLabel("2");
      l3.setOpaque(true);
      center.add(l2);
      center.add(l3);
   
      JFrame frame = new JFrame();
   
      frame.setContentPane(panel);
      frame.setAlwaysOnTop(true);
      frame.pack();
      frame.setVisible(true);
      l1.setBackground(Color.WHITE);
      center.setBackground(Color.RED);
      l2.setBackground(Color.GREEN);
      l3.setBackground(Color.CYAN);
      
      // Pause after this to demo the viewer.
      int q = 0;
      for (int i = 0; i < 100; i++) {
         q++;
      }
   }

}
