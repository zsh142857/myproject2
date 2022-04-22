package com.tom.ticket;

public class StudentTicket extends Ticket{
    float off=0.1f;
    public StudentTicket(Station start,Station destination){
        super(start,destination);
        price= price-(int)(price*2*off);
    }
    @Override
    public void print(){
        System.out.println("Student Ticket"+"\t"+start.name+"\t"+destination.name+"\t"+price);
    }
}
