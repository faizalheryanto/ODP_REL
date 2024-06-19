import java.util.ArrayDeque;
import java.util.Deque;

// Public Main Class
public class DequeDemo {
    // ArrayDeque adalah  implementasi dari interface Deque di Java yang
    // menggunakan array untuk menyimpan elemen-elemennya
    // operasinya: addFirst, addLast, removeFirst, dan removeLast

    // public class ArrayDeque<E>
    //      extends AbstractCollection<E>
    //      implements Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, Queue<E>
    // penjelasan: <E> mewakili sebuah Elemen, yang dapat berupa kelas apapun.

    public static void main(String[] args) {
        // The main() function
        Deque < Integer > objDeque = new ArrayDeque < > ();
        // Adding elements at first and last
        objDeque.addFirst(15);
        objDeque.addLast(28);

        // Removing the elements
        int ele1 = objDeque.removeFirst();
        int ele2 = objDeque.removeLast();

        // Printing removed elements
        System.out.println("First removed element is : " + ele1);
        System.out.println("Last removed element is : " + ele2);
    }
}