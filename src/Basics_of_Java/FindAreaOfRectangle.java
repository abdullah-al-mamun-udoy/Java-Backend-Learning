package Basics_of_Java;


import java.util.Scanner;

class Rectangle {

    // Method to calculate the area of a rectangle
    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}

public class FindAreaOfRectangle {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();
        Rectangle rectangle = new Rectangle();

        // Call the method to calculate the area
        int area = rectangle.calculateArea(length, breadth);

        // Output the result
        System.out.println(area);


    }
}