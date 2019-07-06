/** 
 * BinarySearchExample - This example is intended to illustrate the viewer
 * canvas with the Presentation Structure Identifier rendering of an array
 * when the viewer has been "configured" with indexes.  
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
public class BinarySearchExample {  

   public static void main(String[] args) {
   
      int[] ia = {12, 34, 56, 65, 73, 81, 97};
   
      System.out.println("Index of 12 is: " + binarySearch(12, ia));
      System.out.println("Index of 65 is: " + binarySearch(65, ia));
      System.out.println("Index of 97 is: " + binarySearch(97, ia));
      System.out.println("Index of 100 is: " + binarySearch(100, ia));
   }

   /** 
    * Executes a binary search.
    *
    * @param key the binary search target.
    *
    * @param intArray the sorted array to be searched.
    *
    * @return the index of <code>key</code> or -1 if it was not found. 
    */
   public static int binarySearch(int key, int[] intArray) {
      int low = 0;
      int high = intArray.length - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         if (key < intArray[mid]) {
            high = mid - 1;
         }
         else if (key > intArray[mid]) {
            low = mid + 1;
         }
         else {
            return mid;
         }
      }
      return -1;
   }
}