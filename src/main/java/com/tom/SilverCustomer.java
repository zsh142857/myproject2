package com.tom;

public class SilverCustomer extends Customer {
    int rebate=(cost/1000)*100;
    public SilverCustomer(String number,int cost){
        super(number,cost);
    }
    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+(cost-(cost/1000)*100)+"("+rebate+")");
    }
}
