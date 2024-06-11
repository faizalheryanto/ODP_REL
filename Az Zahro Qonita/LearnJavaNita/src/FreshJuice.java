//Basic Syntax
class FreshJuiceTest {
    enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
    FreshJuiceSize size;
}

public class FreshJuice {
    public static void main(String args[]) {
        FreshJuiceTest juice = new FreshJuiceTest();
        juice.size = FreshJuiceTest.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
    }
}