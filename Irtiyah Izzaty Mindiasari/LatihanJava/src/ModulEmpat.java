public class ModulEmpat {
        enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
        FreshJuiceSize size;
    public static void main(String args[]) {
//        String str = "G11 GC";
//        for(int i = 0 ; i < 1000; i++) {
//            str = str + String.valueOf(i);
//        }
//        System.out.println(str);
        ModulEmpat juice = new ModulEmpat();
        juice.size = ModulEmpat.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
        }
}
