import java.text.NumberFormat;
import java.util.Locale;

public class Employee_staticvar {
    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "RETAIL ENABLER DELIVERY ";

    public static void main(String args[]) {
        salary = 8000000;
        Locale localeID = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(localeID);
        System.out.println(DEPARTMENT + "average salary:" + rupiahFormat.format(salary));
    }
}
