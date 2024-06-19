package JavaVariable;

public class VariableNotInitialization {

    public void pupAge() {
        int age = 0;  // Inisialisasi variabel age
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String[] args) {  // Perbaikan nama method main dan parameter
        VariableNotInitialization step1 = new VariableNotInitialization();
        step1.pupAge();
    }
}
