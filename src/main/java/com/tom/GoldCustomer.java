package com.tom;

public class GoldCustomer extends Customer {
    float goldrebate=cost*2*off;
    public GoldCustomer(String number,int cost){
        super(number,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+cost*8*off+"("+goldrebate+")");
    }
}
