package ForEachLoop;

public class IteratingOverArray {

    public static void main(String args[]) {
        Student[] students = { new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert") };

        for( Student student : students ) {
            System.out.print( student );
            System.out.print(",");
        }
    }
}
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + ", " + this.name + " ]";
    }


}
