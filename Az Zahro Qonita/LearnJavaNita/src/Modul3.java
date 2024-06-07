public class Modul3 {
    //HotSpots: perbandingan dua objek dalam suatu loop. Berfokus pada optimasi kinerja dan untuk
    //mengidentifikasi kode yang sering dijalankan ataupun memakan waktu yang lama untuk mengeksekusinya

//    public static void main(String[] args) {
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//
//        for (int i = 0; i <= 100; i++) {
//            // kondisi jika obj2 samadengan obj1
//            if (i == 50) {
//                obj2 = obj1;
//            }
//            if (obj1.equals(obj2)) {
//                System.out.println("Iteration " + i + ": Objects are equal.");
//            } else {
//                System.out.println("Iteration " + i + ": Objects are not equal.");
//            }
//        }
//    }

    public static void main(String[] args) {
        int sum = 7;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Hasilnya adalah " + sum);
    }
}
