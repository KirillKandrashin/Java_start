package com.company;

public class Main {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=2;
        c=a; //поменял 1 раз
        a=b;
        b=c;
        a=a+b; //поменял обратно другим способом
        b=a-b;
        a=a-b;
        System.out.println("a=" + a + "; b=" + b);

    }
}
