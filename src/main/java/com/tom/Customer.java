package com.tom;

public class Customer {
    String number;
    int cost;
    public Customer(String number,int cost){
        this.number=number;
        this.cost=cost;
    }
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+(cost-(cost/1000)*100));
        System.out.println();
    }

}
