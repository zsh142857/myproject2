package com.tom.test;

public class ElderTicket extends Ticket{
    float off=0.1f;
    public ElderTicket(Station start,Station destination){
        super(start,destination);
        price=price-(int)(off*5*price);
    }
}
