import jgraspvex.DoublyLinkedList;


/**
 * DoublyLinkedListSortExample - This example is intended to illustrate the
 * capabilities of the Presentation Structure Identifier rendering of a doubly
 * linked list structure in the viewer canvas.  
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
public class DoublyLinkedListSortExample {

   public static void main(String[] args) {
      DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
      int[] values = { 10, 5, 4, 12, 1, 9, 7, 8 };
      for (int v : values) {
         list.add(Integer.valueOf(v));
      }
      
      System.out.print("values: ");
      list.printValues();
      System.out.println();
      list.selectionSort();
      System.out.print("sorted values: ");
      list.printValues();
      System.out.println();
   }
}