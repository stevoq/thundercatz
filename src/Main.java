import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {
        //System.out.println("HEYA WORLDS, IS ME DE GREAT AUGUSTOSINIO");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(time); //Seperation-symbol is ":"

    }
}
