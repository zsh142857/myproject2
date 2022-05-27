package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton button=new JButton("GUESS");
    Random random=new Random();
    JTextField number= new JTextField(8);
    int secret = random.nextInt(10 + 1);
    public GuessFrame(){
        super();
        System.out.println("secret "+secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JLabel label=new JLabel("GUESS NUMBER 1~10");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num=Integer.parseInt(number.getText());
                System.out.println(num);
                if(num>secret){
                    label.setText("Smaller");
                }else  if (num<secret){
                    label.setText("Bigger");
                }else {
                    label.setText("The secret number is "+secret);
                }
            }
        });


        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);

        setVisible(true);
    }
    public static void main(String[] args) {
        GuessFrame guessFrame= new GuessFrame();
        //guessFrame.setSize(600,400);
        //guessFrame.setVisible(true);
    }
}
