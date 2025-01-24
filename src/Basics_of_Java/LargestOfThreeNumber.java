package Basics_of_Java;

import java.util.Scanner;

public class LargestOfThreeNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is the highest of amongst all.");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the highest of amongst all.");

        }
        else{
            System.out.println(c + " is the highest of amongst all.");

        }
    }
}
