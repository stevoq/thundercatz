package thundercatz;


import thundercatz.Display.Frame;
import java.time.LocalDateTime;

public class Main {

    public static void main (String[] args) {
        Time time = new Time(LocalDateTime.now());
        System.out.println(time.getStartTime());
        Frame frame = new Frame("TITLE");


        System.out.println("END");
/*
        while (
                //!frame.quit
                ){
            //do the loop
        }*/
    }
}
