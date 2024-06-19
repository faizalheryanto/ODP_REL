package JavaVariable;

public class VariableInstance {
    // this instance variable is visible for any child class.
    public String name;

    // salary variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public VariableInstance(String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {  // P
        VariableInstance empOne = new VariableInstance("Step");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
