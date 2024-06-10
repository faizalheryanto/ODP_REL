public class JavaVirtualMachine {

    // Hotspots
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Contoh Pertama
        for (int i = 0; i <= 100; i++) {
            System.out.println(obj1.equals(obj2));
        }

        // Contoh Kedua
        int sum = 7;
        for(int i = 0 ; i <= 100; i++) {
            sum += i;
        }

        // Output hasil dari Contoh Kedua
        System.out.println("Sum: " + sum);
    }
}
