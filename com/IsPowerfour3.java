package com.zbr.language;

public class IsPowerfour3 {
    //考虑4的二进制表示法
    public void Isfour(int num){
        boolean isPowerOfFour =num>0 && (num & (num-1))==0 && (num & 0xAAAAAAAA)==0;
        System.out.println(isPowerOfFour);
    }

    public static void main(String[] args) {
        IsPowerfour3 is3=new IsPowerfour3();
        is3.Isfour(65);//false
        is3.Isfour(64);//true
    }
}
