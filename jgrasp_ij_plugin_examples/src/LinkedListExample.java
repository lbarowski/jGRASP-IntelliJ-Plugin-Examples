
import jgraspvex.LinkedList;

/**
 * LinkedListExample - This example is intended to illustrate the capabilities
 * of the Presentation Structure Identifier rendering of a linked list
 * structure in the viewer canvas.  
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
public class LinkedListExample {

   public static void main(String[] args) {
    
      while (true) {
         LinkedList<String> list = new LinkedList<>();
         for (int i = 0; i < 2; i++) {
            System.out.println("Add: " + String.valueOf(i));
            list.add(String.valueOf(i));
         }
         
         System.out.println("Add: " + null);
         list.add(null);
                        
         for (int i = 2; i >= 0; i--) {
            System.out.println("Insert: x" + String.valueOf(i)
                                + " at position " + i);
            list.add(i, "x" + i);
         }
      
         for (int i = 0; i < 2; i++) {
            System.out.println("Remove element at position: " + i);
            list.remove(i);                
         }
      }
   }
}