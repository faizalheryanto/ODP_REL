
public class decision {

    public static void main(String args[]) {
        System.out.print("\n<-----IF ELSE----->\n");

        int x = 30;

        if (x < 20) {
            System.out.print("This is if statement");
        } else {
            System.out.print("This is else statement");
        }
        System.out.print("\n<-----END IF ELSE----->\n");

        System.out.print("\n<-----IF - ELSE IF----->\n");

        int x1 = 30;

        if (x1 == 10) {
            System.out.print("Value of X is 10");
        } else if (x1 == 20) {
            System.out.print("Value of X is 20");
        } else if (x1 == 30) {
            System.out.print("Value of X is 30");
        } else {
            System.out.print("This is else statement");
        }

        System.out.print("\n<-----END IF - ELSE IF----->\n");

        System.out.print("\n<-----IF - ELSE IF - ELSE----->\n");
        double x2 = 30.0;

        if (x2 == 10.0) {
            System.out.print("Value of X is 10.0");
        } else if (x2 == 20.0) {
            System.out.print("Value of X is 20.0");
        } else if (x2 == 30.0) {
            System.out.print("Value of X is 30.0");
        } else {
            System.out.print("This is else statement");
        }
        System.out.print("\n<-----END IF ELSE----->\n");

        System.out.print("\n<-----NESTED IF ELSE----->\n");

        int x3 = 10, y3 = 20, z3 = 30;

        if (x3 >= y3) {
            if (x2 >= z3) {
                System.out.println(x2 + " is the largest.");
            } else {
                System.out.println(z3 + " is the largest.");
            }
        } else {
            if (y3 >= z3) {
                System.out.println(y3 + " is the largest.");
            } else {
                System.out.println(z3 + " is the largest.");
            }
        }

        System.out.print("\n<-----END NESTED IF ELSE----->\n");

        System.out.print("\n<-----SWITCH----->\n");

        System.out.print("\n<-----SWITCH 1----->\n");
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

        System.out.print("\n<-----SWITCH 2----->\n");
        int grade1 = 3;

        switch (grade1) {
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
            case 3:
                System.out.println("Well done");
                break;
            case 4:
                System.out.println("You passed");
            case 5:
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade1);

        System.out.print("\n<-----SWITCH 3----->\n");

        String grade2 = "C";

        switch (grade2) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
            case "C":
                System.out.println("Well done");
                break;
            case "D":
                System.out.println("You passed");
            case "F":
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");

                System.out.print("\n<-----END SWITCH----->\n");
        }
    }
}
