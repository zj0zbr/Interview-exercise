package com.zbr.language;

public class IsPowerfour2 {
    //运用公式  logm(n) = log(n) / log(m)
    double log4=  Math.log(4);   //将log（4）分离出来
    public double Isfour(int num){
        double math=Math.log(num)/log4;
        return math;
    }
    //用于判断数值是否是整数
    public boolean judge(double num){
        if(num==(int)num)
            return true;
        else
            return false;
    }
    //测试值
    public static void main(String[] args) {
        IsPowerfour2 is2=new IsPowerfour2();
        double a=is2.Isfour(17);
        boolean b=is2.judge(a);
        System.out.println(b);
    }
}
