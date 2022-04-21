package com.tom.test;

public class Ticket {
    public final int TAIPEI_STATION=0;
    public final int TAICHUNG_STATION=600;
    public final int KAOHSIUNG_STATION=1500;
    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
        if (start==Station.TAIPEI_STATION){
            if (destination==Station.TAICHUNG_STATION){
            price=600;
            }else if (destination==Station.KAOHSIUNG_STATION){
            price=1500;
            }
        }else if (start==Station.TAICHUNG_STATION){
            if (destination==Station.TAIPEI_STATION){
            price=600;
            }else if (destination==Station.KAOHSIUNG_STATION){
            price=900;
            }
        }else if (start==Station.KAOHSIUNG_STATION){
            if (destination==Station.TAIPEI_STATION){
                price=1500;
            }else if (destination==Station.TAICHUNG_STATION){
                price=900;
            }
        }
    }
    public void print(){
        System.out.println(start.name+"\t"+destination.name+"\t"+price);
    }
}
