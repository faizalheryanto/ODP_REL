public class ModulLima {
    //method yang menyimpan nilai pasti, berbeda dengan static [tipedata], ex static int
    //merupakan method yg mendapatkan kembalian nilai, menggunakan return
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        ModulLima test = new ModulLima();
        test.pupAge();
    }
}
