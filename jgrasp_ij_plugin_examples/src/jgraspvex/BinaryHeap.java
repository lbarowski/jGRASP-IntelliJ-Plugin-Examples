package jgraspvex;

public class BinaryHeap<T extends Comparable<T>> {

   private Object[] heap;
   
   private int size;

   public BinaryHeap() {
      heap = new Object[20];
      size = 0;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   public int size() {
      return size;
   }

   @SuppressWarnings("unchecked")
   public T getMax() {
      return (size == 0)? null : (T) heap[1];
   }

   @SuppressWarnings("unchecked")
   public void add(T element) {
      if (size == heap.length - 1) {
         Object[] newHeap = new Object[heap.length * 2];
         System.arraycopy(heap, 0, newHeap, 0, heap.length);
         heap = newHeap;
      }
      size++;
      int pos = size;
      while (pos != 1 && ((T) heap[pos / 2]).compareTo(element) < 0) {
         // Move parent down.
         heap[pos] = heap[pos / 2];
         pos /= 2;
      }
   
      heap[pos] = element;
   }

   @SuppressWarnings("unchecked")
   public T remove() {
      if (size == 0) {
         return null;
      }
      T max = (T) heap[1];
   
      T last = (T) heap[size--];
   
      int node = 1;
      int child = 2;
      while (child <= size) {
         if (child < size
               && ((T) heap[child]).compareTo((T) heap[child + 1]) < 0) {
            child++;
         }
         if (last.compareTo((T) heap[child]) >= 0) {
            break;
         }
         // Move child up.
         heap[node] = heap[child];
         node = child;
         child *= 2;
      }
      heap[node] = last;
   
      return max;
   }
}
