public class EnumTest {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        Day today = Day.THURSDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is MOOoOonday");
                break;
            case TUESDAY:
                System.out.println("This is TuesdaAaaAy");
                break;
            case WEDNESDAY:
                System.out.println("This is WednesdaAaAay");
                break;
            default:
                System.out.println("Today is another day!");
                break;
        }
    }
}
