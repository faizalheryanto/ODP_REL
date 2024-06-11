public class LocalVariables {
    //Java Local Variables:
    //Tidak ada nilai default untuk variabel lokal, jadi variabel lokal
    // harus dideklarasikan dan nilai awal harus ditetapkan sebelum pertama kali digunakan.

    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        LocalVariables test = new LocalVariables();
        test.pupAge();
    }
}
