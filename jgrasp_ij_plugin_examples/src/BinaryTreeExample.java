import jgraspvex.BinaryTree;

/**
 * BinaryTreeExample - This example is intended to illustrate the the
 * capabilities of the Presentation Structure Identifier rendering of a
 * binary search tree structure in the viewer canvas.
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
public class BinaryTreeExample {

   /**
    * Runs the example.
    *
    * @param args command line arguments, which are ignored.
    */
   public static void main(String[] args) {
   
      // Unsorted test values.
      int[] values = { 5, 9, 12, 3, 22, 1, 17, 4, 8, 11 };
   
      // Sorted test values.
      int[] sortedValues = { 1, 3, 4, 5, 8, 9, 11, 12, 17, 22 };
   
   
      while (true) {
         BinaryTree<Integer> bt = new BinaryTree<>();
         for (int i = 0; i < values.length; i++) {
            System.out.println("Add: " + values[i]);
            bt.add(Integer.valueOf(values[i]));
         }
         for (int i = 0; i < sortedValues.length; i++) {
            System.out.println("Remove: " + sortedValues[i]);
            bt.remove(Integer.valueOf(sortedValues[i]));
         }
      }
   }
}
