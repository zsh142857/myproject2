package com.tom.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You start station?[1]Taipei, [2]Taichung, [3]KAOHSIUNG");
        Station start=null;
        int startChoice=Integer.parseInt(scanner.next());
        switch (startChoice){
            case 1:
                start= Station.TAIPEI_STATION;
                break;
            case 2:
                start= Station.TAICHUNG_STATION;
                break;
            case 3:
                start= Station.KAOHSIUNG_STATION;
                break;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("You destination station?[1]Taipei, [2]Taichung, [3]KAOHSIUNG");
        Station destination=null;
        int destinationChoice=Integer.parseInt(scanner2.next());
        switch (destinationChoice){
            case 1:
                destination= Station.TAIPEI_STATION;
                break;
            case 2:
                destination= Station.TAICHUNG_STATION;
                break;
            case 3:
                destination= Station.KAOHSIUNG_STATION;
                break;
        }
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Which kind of ticket? [1]Student [2]Elder [3]Normal");
        int choice=Integer.parseInt(scanner3.next());
        Ticket ticket=null;
        switch (choice){
            case 1:
                ticket=new StudentTicket(start,destination);
                break;
            case 2:
                ticket=new ElderTicket(start,destination);
                break;
            case 3:
                ticket=new Ticket(start,destination);
                break;
        }

        ticket.print();


    }
}
