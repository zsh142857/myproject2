package com.tom.test;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which is start station? [1] TAIPEI [2]TAICHUNG [3] KAOHSIUNG");
        Station start=null;
        int choice1=Integer.parseInt(scanner.next());
        switch (choice1){
            case 1:
                start=Station.TAIPEI_STATION;
                break;
            case 2:
                start=Station.TAICHUNG_STATION;
                break;
            case 3:
                start=Station.KAOHSIUNG_STATION;
                break;
        }
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Which is destination station? [1] TAIPEI [2]TAICHUNG [3] KAOHSIUNG");
        Station destination=null;
        int choice2=Integer.parseInt(scanner2.next());
        switch (choice2) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        Scanner scanner3=new Scanner(System.in);
        System.out.println("Which type of ticket do you need? [1] Normal [2]Student [3] Elder");
        Ticket ticket=null;
        int choice3=Integer.parseInt(scanner3.next());
        switch (choice3) {
            case 1:
                ticket=new Ticket(start,destination);
                break;
            case 2:
                ticket=new Ticket(start,destination);
                break;
            case 3:
                ticket=new Ticket(start,destination);
                break;
        }
        ticket.print();
    }

}
