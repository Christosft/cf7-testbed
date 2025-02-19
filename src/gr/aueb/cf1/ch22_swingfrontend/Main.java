package gr.aueb.cf1.ch22_swingfrontend;

import java.awt.*;

public class Main {

        private static final HelloFrame helloFrame = new HelloFrame();

    public static void main(String[] args) {


        EventQueue.invokeLater(() -> helloFrame.setVisible(true));
    }



}
