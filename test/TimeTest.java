import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeTest {

    @Test
    public void startTimeTest(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String testTime = dtf.format(LocalDateTime.now());

        Time time = new Time(LocalDateTime.now());
        //TODO
    }
}
