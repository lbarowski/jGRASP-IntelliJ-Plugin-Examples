import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListExample - This example is intended to illustrate the capabilitie
 * of the array viewer, ArrayList viewer, and the viewer canvas in jGRASP.
 * String array elements are added to and removed from an ArrayList.
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
public class ArrayListExample {

   public static void main(String[] args) {
      List<String> list;
      String[] stringList = {"cat", "dog", "ant", "monkey", "flea"};
      list = new ArrayList<>();
      
      while (true) {
         for (int i = 0; i < stringList.length; i++) {
            list.add(stringList[i]);
            System.out.println(list);
         }  
         list.remove(3);
         System.out.println(list);
         list.add(3, "rat");
         System.out.println(list);
         list.add(3, stringList[2]); 
         System.out.println(list);
         list.clear();
      }
   }
}