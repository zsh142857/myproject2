package com.tom.sell;

public class GoldCustomer extends Customer {
    float GoldRebate=cost*2*off;
    public GoldCustomer(String number,int cost){
        super(number,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+cost*8*off+"("+GoldRebate+")");
        System.out.println();
    }
}
