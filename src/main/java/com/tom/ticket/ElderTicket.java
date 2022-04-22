package com.tom.ticket;

public class ElderTicket extends  Ticket{
    float off=0.1f;
    public ElderTicket(Station start,Station destination){
        super(start,destination);
        price= price-(int)(price*5*off);
    }
    @Override
    public void print(){
        System.out.println("Elder Ticket"+"\t"+start.name+"\t"+destination.name+"\t"+price);
    }
}
