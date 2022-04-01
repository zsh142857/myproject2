package com.tom.sell;

public class PlatinumCustomer extends  Customer{
    float PlatinumBate=cost*2*off;
    public PlatinumCustomer(String id, int cost){
        super(id,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+cost*7*off+"("+PlatinumBate+")");
        System.out.println();
    }
}
