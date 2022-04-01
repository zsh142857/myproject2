package com.tom.sell;

public class DiscountCustomer extends Customer{

    public DiscountCustomer(String id,int cost){
        super(id,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+cost*9*off);
    }
}
