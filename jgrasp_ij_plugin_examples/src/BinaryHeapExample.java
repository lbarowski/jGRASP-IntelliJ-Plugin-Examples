import jgraspvex.BinaryHeap;

/**
 * BinaryHeap.java -- This example is intended to illustrate the capabilities
 * of the Presentation Structure Identifier rendering of a "heap" structure in
 * the viewer canvas.  
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
public class BinaryHeapExample {

   public static void main(String [] args) {
      BinaryHeap<String> hp = new BinaryHeap<>();
      System.out.println("Binary Heap Example");
      System.out.println("Add: C");
      hp.add("C");
      System.out.println("Add: D");
      hp.add("D");
      System.out.println("Add: b");
      hp.add("b");
      System.out.println("Add: a");
      hp.add("a");
      System.out.println("Add: C");
      hp.add("C");
      System.out.println("Remove");
      hp.remove();
      System.out.println("Add: z");
      hp.add("z");
      System.out.println("Remove");
      hp.remove();
      System.out.println("Add: k");
      hp.add("k");
   }
}
