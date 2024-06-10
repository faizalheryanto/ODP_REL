public class JITOptimisations {
    static int sum3;

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        sum3 = add(5, 7) + add(4, 2);
        System.out.println("Result: " + sum3);
    }

    // Void Foo
    static void foo(boolean a, boolean b) {
        if (a) return;
        else return;
    }

    // Constant Folding
    final int num = 5;
    int b = num * 6;

}
