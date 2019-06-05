package com.company.interview;

public class FibonacciTest {
    public void Fib1(){
        int a=1,b=1,c=0;
        for (int i=0;i<20;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }

    public static int Fib2(int i){
        if(i==1||i==2)
            return 1;
        else
            return Fib2(i-1)+Fib2(i-2);
    }


    public static void main(String[] args) {
        FibonacciTest fibonacciTest=new FibonacciTest();
        for (int j = 1; j <= 20; j++) {
            System.out.print(Fib2(j) + "\t");
        }
    }
}
