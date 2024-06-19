public class ModulTiga {

    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        //instansiasi object untuk mendefinisikan object yang akan diiterasi di tahapan selanjutnya
        System.out.println("Contoh Membandingkan Object");
        Object obj1 = new Object();
        Object obj2 = new Object();
        for(int i = 0 ; i <= 100; i++) {
            // untuk mengecek apakah object tersebut sama atau tidak
            if (i>= 10){
                obj1 = obj2;
            }
            System.out.println(obj1.equals(obj2)); //two objects
        }
        System.out.println("");
        System.out.println("Contoh Hotspot");
        int sum = 7;
        for(int i = 0 ; i <= 100; i++) {
            sum += i;
            //ngeprint sum sebanyak 100 kali
            // setiap looping menyimpan nilai terakhir dan ditambahkan dengan looping ke-i
            System.out.println(sum);
        }
        System.out.println("");
        System.out.println("Contoh Method Inlining");
        int sum3, sum4;
        sum3 = add(5,7) + add(4,2);
        System.out.println("sebelum method iniling:" + sum3);

        sum4 = 5+ 7 + 4 + 2;
        System.out.println("setelah method iniling:" + sum4);
    }
}
