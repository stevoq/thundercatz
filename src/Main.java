import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String[] args) {
        Time time = new Time(LocalDateTime.now());
        System.out.println(time.getStartTime());

    }
}
