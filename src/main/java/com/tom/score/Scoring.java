package com.tom.score;

public class Scoring {
    public static void main(String[] args) {
        Student sam = new Student("Sam",75,91);
        Student ben = new Student("Ben",25,84);
        GraduateStudent tim =new GraduateStudent("Tim",60,50,70);
        tim.name="Tim";
        sam.print();
        ben.print();
        tim.print();
    }
}
