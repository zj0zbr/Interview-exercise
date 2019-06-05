package com.company.generics;

public class IsIPTest {
    public int[] ToInt(String IP){
        String[] str=IP.split("\\.");
        int[] IntIP = new int[str.length];
        for(int i=0;i<str.length;i++){
            IntIP[i]= Integer.parseInt(str[i]);
            System.out.println(IntIP[i]);
        }
        return IntIP;
    }

    public boolean IsIP(int[] IP){
        int count=0;
        for(int i=0;i<IP.length;i++){
            if(IP[i]>=0&&IP[i]<255){
                count++;
            }else {
                System.out.println(count);
            }
        }
        if(count==4)
            return true;
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        IsIPTest is=new IsIPTest();
        int[] IP1=is.ToInt("127.0.00.1");
        boolean b=is.IsIP(IP1);
        System.out.println(b);
    }
}
