package ObjectAndClass;

public class JavaExampleClass {

    class Dog {

        String breed;
        int age;
        String color;

        // methods to set breed, age, and color of the dog
        public void setBreed(String breed) {
            this.breed = breed;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setColor(String color) {
            this.color = color;
        }

        // method to print all three values
        public void printDetails() {
            System.out.println("Dog detials:");
            System.out.println(this.breed);
            System.out.println(this.age);
            System.out.println(this.color);
        }
    }

}
