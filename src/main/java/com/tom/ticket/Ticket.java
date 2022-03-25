package com.tom.ticket;

public class Ticket {
    static  final int TAIPEI_STATION=1000;
    static  final int TAICHUNG_STATION=3300;
    static  final int KAOHSIUNG_STATION=4400;
    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
    }
}
