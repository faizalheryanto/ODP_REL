package BasicOperator;

public class ExampleC {

    // Class Car extends ExampleC
    public static class Car extends ExampleC {

        public static void main(String[] args) {
            ExampleC c = new Car();
            boolean result = c instanceof Car;
            System.out.println(result);
        }
    }
}
