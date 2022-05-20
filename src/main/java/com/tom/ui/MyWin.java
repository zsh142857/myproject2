package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setLocation(550,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button1=new JButton("點我");
       // MyActionListener listener=new MyActionListener();
        //button1.addActionListener(listener);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hmmm...");
            }
        });

        frame.add(button1);
        frame.add(new JButton("?"));

        frame.setLayout(new FlowLayout());
        /*
        JButton a= new JButton("a");
        JButton b= new JButton("b");
        JButton c= new JButton("c");
        JButton d= new JButton("d");
        JButton e= new JButton("e");
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("a");
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("b");
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("c");
            }
        });
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("d");
            }
        });
        e.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("e");
            }
        });
        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(d);
        frame.add(e);
*/
        frame.setVisible(true);

        System.out.println("WTF?");
    }
}
