package Arrays_and_String;

import java.util.Scanner;

public class Rectangle {

    public static int getArea(double length, double breadth){

        return (int)(length*breadth);
    }

    public static void main(String[] args){

        double length, breadth;
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        sc.close();
        System.out.println(getArea(length,breadth));




    }
}
