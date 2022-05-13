package com.tom.sell;

public class GoldCustomer extends SilverCustomer {

    public GoldCustomer(String number,int cost){
        super(number,cost);
    }
    float off=0.2f;
    @Override
    public void print(){

        System.out.println(number+"\t"+cost+"\t"+getoff()*8+"("+getoff()*2+")");
    }
}
