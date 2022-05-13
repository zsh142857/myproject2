package com.tom.sell;

public class SilverCustomer extends Customer {
    public SilverCustomer(String number,int cost){
        super(number,cost);
    }
    public float getoff() {
        return (int)(cost*0.1f);
    }

    @Override
    public void print(){
        System.out.println(number+"\t"+cost+"\t"+(cost-getoff())+"("+ getoff() +")" );
    }
}
