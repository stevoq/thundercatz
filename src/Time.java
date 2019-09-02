import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    DateTimeFormatter dateTimeFormatter;
    String startTime;

    public Time (LocalDateTime nowTime){
      dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
      startTime = dateTimeFormatter.format(nowTime);

    }

    public Time(String givenTime){

    }


    public String getStartTime() {
        return startTime;
    }
}
