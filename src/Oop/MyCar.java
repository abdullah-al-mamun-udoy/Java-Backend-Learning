package Oop;


import java.util.Scanner;

class Car{
    int noOfGear;
    String color;

    Car(int noOfGear, String color){
        this.noOfGear = noOfGear;
        this.color = color;
    }

    void printCarInfo(){
        System.out.println("noOfGear: " + noOfGear);
        System.out.println("color: " + color);
    }
}

class RaceCar extends Car{

    int maxSpeed;

    RaceCar(int noOfGear, String color, int maxSpeed) {
        super(noOfGear, color);
        this.maxSpeed = maxSpeed;
    }
    void printRaceCarInfo() {
        printCarInfo(); // Calls parent method to print noOfGear and color
        System.out.println("maxSpeed: " + maxSpeed);
    }
}


public class MyCar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);

        // Calling the method to print RaceCar details
        raceCar.printRaceCarInfo();

    }
}
