
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import java.util.Random;

import javax.swing.ImageIcon;

/**
 * ImageAndColorExample - This example is intended to illustrate the
 * capabilities of the jGRASP viewers for java.awt.Image,
 * javax.swing.ImageIcon, and java.awt.Color.
 *
 * Click the "Run in Canvas" button on the toolbar. Then on the canvas window,
 * click the "Play" button. Regulate the speed with the "Delay" slider.
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
public class ImageAndColorExample {

   private static Image[] images;

   static {
      Toolkit tk = Toolkit.getDefaultToolkit();
      images = new Image[3];
      images[0] = tk.createImage("testimg.png");
      images[1] = tk.createImage("testimg2.png");
      images[2] = tk.createImage("testimg3.png");
      for (int i = 0; i < images.length; i++) {
         tk.prepareImage(images[i], -1, -1, null);
      }
   }

   private static Random random = new Random();


   public static void main(String[] args) {
      Image image = images[images.length - 1];
      ImageIcon imageIcon = new ImageIcon(images[0]);
      Color color = new Color(random.nextInt());
   
      while (true) {
         for (int i = 0; i < images.length; i++) {
            imageIcon.setImage(image);
            image = images[(i + 1) % images.length];
            color = new Color(random.nextInt());
         }
      }
   }
}