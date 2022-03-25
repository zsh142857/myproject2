package com.tom.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(
                Station.TAIPEI_STATION,
                Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("You start station?[1]Taipei, [2]Taichung, [3]KAOHSIUNG");
        Station startStation=null;
        int startChoice=Integer.parseInt(scanner.next());
        switch (startChoice){
            case 1:
                startStation= Station.TAIPEI_STATION;
                break;
            case 2:
                startStation= Station.TAICHUNG_STATION;
                break;
            case 3:
                startStation= Station.KAOHSIUNG_STATION;
                break;
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("You destination station?[1]Taipei, [2]Taichung, [3]KAOHSIUNG");
        Station destinationStation=null;
        int destinationChoice=Integer.parseInt(scanner2.next());
        switch (destinationChoice){
            case 1:
                destinationStation= Station.TAIPEI_STATION;
                break;
            case 2:
                destinationStation= Station.TAICHUNG_STATION;
                break;
            case 3:
                destinationStation= Station.KAOHSIUNG_STATION;
                break;
        }
    }
}
