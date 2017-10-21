package com.zbr.language;

public class IsPowerfour {
    public boolean isfour(int num){
        if (num<=0)
            return false;
        else if(num==1){
            System.out.println("4的0次幂");
            return true;
        }
        else{
            while (num % 4 ==0){
                num >>= 2;
                System.out.println(num);
            }
        }
        return num==1;
    }

    public static void main(String[] args) {
        IsPowerfour is=new IsPowerfour();
        boolean b=is.isfour(125);
        System.out.println(b);
    }
}
