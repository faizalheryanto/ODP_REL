package JavaVariable;

public class VariableInitialization {

    public void popAge(){
        int age =0;
        age = age+7;
        System.out.println("Puppy Age is = " + age);
    }

    public static  void Mains (String args[]) {
        VariableInitialization test = new VariableInitialization();
        test.popAge();
    }


}
