package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num>21) {
            System.out.println(num-21);
        }
        else{
            System.out.println(21-num);
        }
    }
}
