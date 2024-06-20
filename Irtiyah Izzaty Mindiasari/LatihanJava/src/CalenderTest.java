import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    public static void main(String[] args) {

        // create calendar objects.
        Calendar cal = Calendar.getInstance();
        Calendar future = Calendar.getInstance();

        // print the current date
        System.out.println("Current date: " + cal.getTime());

        // change year in future calendar
        future.set(Calendar.YEAR, 2025);
        System.out.println("Year is " + future.get(Calendar.YEAR));

        // check if calendar date is after current date
        Date time = future.getTime();

        if (future.after(cal)) {
            System.out.println("Date " + time + " is after current date.");
        }

        System.out.println("--------------------");

        // create a date of current time
        Date date = Date.from(Instant.now());

        // print the date instance
        System.out.println("Date: " + date.toString());

        System.out.println("--------------------");

        // Membuat instance Instant yang mewakili waktu saat ini
        Instant now = Instant.now();
        System.out.println("Current timestamp: " + now);

        // Menambah 10 detik
        Instant later = now.plus(Duration.ofSeconds(10));
        System.out.println("10 seconds later: " + later);

        // Mengurangi 5 menit
        Instant earlier = now.minus(Duration.ofMinutes(5));
        System.out.println("5 minutes earlier: " + earlier);

        System.out.println("--------------------");

        Instant start = Instant.now();
        try {
            Thread.sleep(2000); // Tidur selama 2 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration.toMillis() + " milliseconds");
    }
}
