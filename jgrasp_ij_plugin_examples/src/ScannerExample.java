import java.util.Scanner;

/**
 * ScannerExample - This example is intended to illustrate the capabilities of
 * the jGRASP viewers for the Scanner class and arrays.
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
public class ScannerExample {

   /**
    * Reads in a line of text, stores words in an array,
    * stores words in reverse order in another array,
    * prints the words.
    *
    * @param args command line arguments, which are ignored.
    */
   public static void main(String[]args) {
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Enter a line of text (max 20 words): ");
      String sentence = scan.nextLine();
      scan.close();
   
      Scanner scanSentence = new Scanner(sentence);
      scanSentence.useDelimiter("\\W");
      String[] words = new String[20];
      String[] wordsReverse = new String[20];
   
      int wc = 0;
      while (scanSentence.hasNext()) {
         words[wc] = scanSentence.next();
         wc++;
      }
      scanSentence.close();
   
      int k = 0;
      for (int j = wc - 1; j >= 0; j--) {
         wordsReverse[k] = words[j];
         k++;
      }
   
      for (int j = wc - 1; j >= 0; j--) {
         System.out.print(words[j] + " ");
      }
   }
}