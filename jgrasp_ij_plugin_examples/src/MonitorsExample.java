

/**
 * MonitorsExample - This example is intended to illustrate the capabilities
 * of the jGRASP "Monitor Info" viewer.
 *
 * Click the "Run in Canvas" button on the toolbar. Then on the canvas
 * window, click the "Play" button. You'll see the other threads queuing up
 * whenever the main thread enters the synchronized block. Hit the "Pause"
 * button when the main thread is inside the synchronized block to see all of
 * the other threads queue up.
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
public class MonitorsExample {

   /** Synchronization object. */
   private static Object sync = new Object();

   public static void main(final String[] args) {
   
      for (int i = 0; i < 10; i++) {
         Runnable r =
            new Runnable() {
               public void run() {
                  go();
               }
            };
         Thread tr = new Thread(r);
         tr.setName("Thread " + i);
         tr.start();
      }
      for (int i = 0; i < 100; i++) {
         synchronized (sync) {
            try {
               Thread.sleep(50);
            }
            catch (InterruptedException e) {
            }
         }
      }
   }


   public static void go() {
   
      while (true) {
         synchronized (sync) {
            try {
               Thread.sleep(50);
            }
            catch (InterruptedException e) {
            }
         }
         try {
            for (int i = 0; i < 10 + Math.random() * 150; i++) {
               Thread.sleep(100);
            }
         }
         catch (InterruptedException e) {
         }
      }
   }
}