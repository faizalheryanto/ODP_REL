//Variable's local scope with initialization
public class Initialization {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is : " + age);
    }

    public static void main(String args[]) {
        Initialization test = new Initialization();
        test.pupAge();
    }
}

