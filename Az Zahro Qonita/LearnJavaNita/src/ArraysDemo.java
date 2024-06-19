import java.util.Arrays;
public class ArraysDemo {
    //untuk menyimpan beberapa elemen dari tipe data yang sama dalam urutan yang tetap.
    //kelas utilitas yang menyediakan berbagai metode statis untuk manipulasi array.
    public static void main(String[] args) {
        // Declaring an array
        int arr[] = {8, 5, 3, 10, 2, 1, 15, 20};

        // Sorting the array
        Arrays.sort(arr);

        // Taking an element to search
        int ele = 20;

        // Using binarySearch() method to search "ele"
        System.out.println(
                ele + " presents at the index = " +
                        Arrays.binarySearch(arr, ele));
    }
}
