//Java Instance Variables: menyimpan nilai yang harus direferensikan oleh lebih
// dari satu metode, konstruktor atau blok, atau bagian penting dari
// keadaan objek yang harus ada di seluruh class.
public class Employee {

//    // this instance variable is visible for any child class.
//    public String name;
//
//    // salary  variable is visible in Employee class only.
//    private double salary;
//
//    // The name variable is assigned in the constructor.
//    public Employee (String empName) {
//        name = empName;
//    }
//
//    // The salary variable is assigned a value.
//    public void setSalary(double empSal) {
//        salary = empSal;
//    }
//
//    // This method prints the employee details.
//    public void printEmp() {
//        System.out.println("name  : " + name );
//        System.out.println("salary :" + salary);
//    }
//
//    public static void main(String args[]) {
//        Employee empOne = new Employee("Laura");
//        empOne.setSalary(500);
//        empOne.printEmp();
//    }
//



    //Java Class/Static Variables
    //Mirip dengan variabel instance, tetapi sebagian besar variabel statis
    // dinyatakan publik karena harus tersedia untuk pengguna pada class tersebut.


    // salary  variable is a private static variable
    private static double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        salary = 600;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}