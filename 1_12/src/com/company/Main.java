package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int x1 = in.nextInt();
        System.out.print("Input 2nd number: ");
        int y1 = in.nextInt();
        System.out.print("Input 3d number: ");
        int x2 = in.nextInt();
        System.out.print("Input 4th number: ");
        int y2 = in.nextInt();
        double a = x1-x2;
        double b = y1-y2;
        double c= a*a+b*b;
        System.out.println(Math.sqrt(c));
    }
}
