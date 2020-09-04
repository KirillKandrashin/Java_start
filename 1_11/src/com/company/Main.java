package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = in.nextInt();
        System.out.print("Input 2nd number: ");
        int b = in.nextInt();
        double c = a*b;
        System.out.println(Math.sqrt(c));
    }
}
