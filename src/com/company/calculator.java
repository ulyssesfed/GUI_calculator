package com.company;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class calculator {
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton seven;
    private JButton ACButton;
    private JButton button14;
    private JButton button4;
    private JTextPane textPane1;
    int result = 0;
    String input = "adad";


    public calculator() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setContentPane(new calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
