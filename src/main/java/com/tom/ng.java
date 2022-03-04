package com.tom;

public class ng {
    public static void main(String[] args) {
        String [] names={"Sam","Ben","Tim","Ian","Jim"};
        int [] englishs={75,45,66,78,90};
        int [] maths={91,84,76,44,64};
        for (int i = 0; i <5; i++) {
            System.out.println(names[i]+"\t"+englishs[i]+"\t"+maths[i]+"\t"+(englishs[i]+maths[i])/2);
        }
    }
}
