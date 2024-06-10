public class GenerationalGCS {
    public static void main(String[] args) {
        String str = "G11 GC";

        for (int i = 0; i < 1000; i++) {
            str = str + String.valueOf(i);
        }
    }
}
