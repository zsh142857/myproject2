package com.tom.sell;

public class SilverCustomer extends Customer {
    float rebate=cost*off;
    public SilverCustomer(String number,int cost){
        super(number,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+(cost-getoff())+"("+rebate+")");
        System.out.println();
    }
}
