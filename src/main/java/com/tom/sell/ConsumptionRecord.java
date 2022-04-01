package com.tom.sell;

import java.util.ArrayList;
import java.util.List;

public class ConsumptionRecord {
    public static void main(String[] args) {
        List<Customer> Customers= new ArrayList<>();
        Customers.add(new Customer("0001",1200));
        Customers.add(new Customer("0002",800));
        Customers.add(new SilverCustomer("0003",2000));
        Customers.add(new GoldCustomer("0004",5000));
        Customers.add(new DiscountCustomer("0005",900));
        Customers.add(new PlatinumCustomer("0006",1000));
        for (int i = 0; i <6 ; i++) {
            Customers.get(i).print();
        }
        for(Customer c: Customers){
            c.print();
        }
    }

}
