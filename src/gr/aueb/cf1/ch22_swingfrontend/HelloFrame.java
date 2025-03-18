package gr.aueb.cf1.ch22_swingfrontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {


        public HelloFrame() {
            this.setTitle("Hello Coding Frame");
            setSize(400, 200);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.add(new JLabel("Hello Coding Factory"));

            JButton btn = new JButton("Click Me");
            contentPane.add(btn);

            //JButton btn1 = new JButton("Push to see");
            //contentPane.add(btn1);

            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Hello Coding Factory", "Hello", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            //btn1.addActionListener(new ActionListener() {
            //    @Override
            // public void actionPerformed(ActionEvent e) {
            //        JOptionPane.showMessageDialog(null, "click here to see ", "click", JOptionPane.INFORMATION_MESSAGE);
            //    }
            //});
        }
    }

