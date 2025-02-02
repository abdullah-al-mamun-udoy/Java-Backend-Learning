package Basics_of_Java;

import java.util.Scanner;

public class PowerOfANumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x,y;
        x= sc.nextDouble();
        y = sc.nextDouble();
        sc.close();
        int ans = (int) Math.pow(x,y);
        System.out.println(ans);
    }
}
