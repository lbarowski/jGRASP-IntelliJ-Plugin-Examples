
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;


/**
 * CollectionsExample - This example is intended to illustrate the
 * capabilities of the jGRASP viewers for the classes in the Java Collections
 * Framework.
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
public class CollectionsExample {

   public static void main(String[] args) {
      Integer[] integerList = { Integer.valueOf(1), Integer.valueOf(2),
            Integer.valueOf(9), Integer.valueOf(7), Integer.valueOf(4),
            Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(5),
            Integer.valueOf(3), Integer.valueOf(6) };
      String[] stringList = {"cat", "dog", "mouse",
            "ant", "monkey", "flea", "gnu", "lizard",
            "frog", "horse" };
      int[] myint = new int[10];
      List<String> myVector = new Vector<>();
      List<String> myArrayList = new ArrayList<>();
      List<String> myLinkedList = new LinkedList<>();
      Stack<String> myStack = new Stack<>();
      Map<String, Integer> myHashMap = new HashMap<>(7, 1.5f);
      Map<String, Integer> myHashtable = new Hashtable<>(7, 1.5f);
      myHashMap.put(null, Integer.valueOf(0));
      Map<String, Integer> myTreeMap = new TreeMap<>();
   
      while (true) {
         for (int i = 0; i < integerList.length; i++) {
            myVector.add(stringList[i]);
            myArrayList.add(stringList[i]);
            myLinkedList.add(stringList[i]);
            myStack.push(stringList[i]);
            myHashMap.put(stringList[i], integerList[i]);
            myHashtable.put(stringList[i], integerList[i]);
            myTreeMap.put(stringList[i], integerList[i]);
            myint[i] = integerList[i].intValue();
         }
         for (int i = integerList.length - 1; i >= 0; i--) {
            myHashMap.remove(stringList[i]);
         }
         myArrayList.remove(3);
         myArrayList.add(3, "rat");
         myStack.pop();
         myVector.clear();
         myArrayList.clear();
         myLinkedList.clear();
         myHashMap.clear();
         myHashtable.clear();
         myTreeMap.clear();
      }
   }
}