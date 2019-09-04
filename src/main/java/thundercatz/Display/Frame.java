package Java.thundercatz.Display;

import javax.swing.*;

public class Frame {

    JFrame jframe;

    public Frame (String title){
        jframe = new JFrame(title);
        jframe.setSize(900, 300);
        jframe.setResizable(false);
        jframe.setLocation(100,100);
        jframe.setVisible(true);
    }

    public void open (){

    }
}
