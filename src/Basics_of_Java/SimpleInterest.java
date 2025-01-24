package Basics_of_Java;

import java.util.Scanner;

public class SimpleInterest {

    public static int calculator(int principal, float interest, int times) {
        return (int) (principal * interest * times) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float interest = sc.nextFloat();
        int times = sc.nextInt();
        sc.close();


        System.out.println(calculator(principal, interest, times));
    }
}
