package IfElse;

public class ExampleD {

    public static void main(String[] args) {

        int x = 10, y = 20, z = 30;

        if(x >= y) {
            if(x >= z)
                System.out.println(x + " is the largest.");
            else
                System.out.println(z + " is the largest.");
        } else {
            if(y >= z)
                System.out.println(y + " is the largest.");
            else
                System.out.println(z + " is the largest.");
        }
    }

}
