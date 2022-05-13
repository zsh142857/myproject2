package com.tom.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student sam = new Student("Sam",75,91);
        Student ben = new Student("Ben",25,84);
        GraduateStudent tim =new GraduateStudent("Tim",60,50,70);
        List<Student> students=new ArrayList<>();
        students.add(sam);
        students.add(ben);
        students.add(tim);
        for (int i = 0; i < (students.size()); i++) {
            Student stu=students.get(i);
            stu.print();
        }
/*
        sam.print();
        ben.print();
        tim.print();*/
    }
}
