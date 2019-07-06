
import java.io.BufferedReader;
import java.io.StringReader;

import java.util.StringTokenizer;

/**
 * TwoDArrayStringExample.java - This example is intended  to illustrate the
 * capabilities of the Presentation Structure Identifier rendering of a 2D
 * array in the viewer canvas.  
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
public class TwoDArrayStringExample {

   /**
    * Creates a 2D array of Strings, fills it with words for a test String,
    * then prints them out.
    *
    * @param args command line arguments, which are ignored.
    */
   public static void main(String[] args) throws Exception {
      String[][] table = new String[5][10];
   
      String data = "This is a test of two-dimensional arrays for the\n"
            + "array viewer. No more than 10 words per line.\n"
            + "[Third line of text goes here.]";
      StringReader sr = new StringReader(data);
      BufferedReader reader = new BufferedReader(sr);
   
      int row = 0;
      String line;
      while ((line = reader.readLine()) != null) {   
         int col = 0;
         StringTokenizer words = new StringTokenizer(line);
         
         while (words.hasMoreTokens()) {
            table[row][col] = words.nextToken();
            System.out.println(table[row][col]);
            col++;
         }
         row++;
         System.out.println();
      }
         
      reader.close();
   }
}
