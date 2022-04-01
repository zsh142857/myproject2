package com.tom.sell;

public class ConsumptionRecord {
    public static void main(String[] args) {
        Customer fir= new Customer("0001",1200);
        Customer sec= new Customer("0002",800);
        SilverCustomer thi= new SilverCustomer("0003",2000);
        GoldCustomer four= new GoldCustomer("0004",5000);
        DiscountCustomer fif= new DiscountCustomer("0005",900);
        PlatinumCustomer six= new PlatinumCustomer("0006",1000);
        fir.number="0001";
        fir.print();
        sec.print();
        thi.print();
        four.print();
        fif.print();
        six.print();
    }

}
