// Importing classes
import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDequeTest {
    public static void main(String[] args) {
        // The main() function
        Deque < Integer > objDeque = new ArrayDeque<>();

        //arraydeque berfungsi untuk menambahkan atau menghapus elemen dikedua ujung (head and tail)

        objDeque.push(5);
        objDeque.push(10);
        objDeque.push(20);
        // Adding elements at first and last
        objDeque.addFirst(15);
        objDeque.addLast(28);

        System.out.println("object array: " + objDeque);

        // Removing the elements
        int ele1 = objDeque.removeFirst();
        int ele2 = objDeque.removeLast();

        // Printing removed elements
        System.out.println("First removed element is : " + ele1);
        System.out.println("Last removed element is : " + ele2);
        System.out.println("object setelah remove:" + objDeque);
    }
}
