package com.tom.sell;

public class Customer {
    String number;
    int cost;
    float off=0.1f;
    public Customer(String number,int cost){
        this.number=number;
        this.cost=cost;
    }
    public float getoff(){
        return (cost/1000)*off*1000;
    }
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+(cost-getoff()));
        System.out.println();
    }

}
