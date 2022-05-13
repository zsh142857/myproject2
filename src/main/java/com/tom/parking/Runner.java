package com.tom.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1111";
        String enterTime ="08:00";
        SimpleDateFormat sdf=
                new SimpleDateFormat("HH:mm");
        String exitTime="11:45";
        //Date d= new Date();
        Date d= null;
        try {
            d=sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
       // long ms =3*60*60*1000;
       // Date d2 =new Date();
        try {
            Date d2=sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms=d2.getTime()-d.getTime();
            int minutes= (int)(ms/(1000*60));
            System.out.println(minutes);
            int hours= (minutes)/60;
            int HalfHour=(minutes)%60;
            int halfprice=15;
            if (HalfHour<15){
                halfprice=0;
            }if(HalfHour>=15&&HalfHour<=30){
                halfprice=15;
            }
            System.out.println("fee:"+(hours*30+halfprice));
        }catch (Exception e){
            System.out.println("exit wrong format");
        }

    }
}
