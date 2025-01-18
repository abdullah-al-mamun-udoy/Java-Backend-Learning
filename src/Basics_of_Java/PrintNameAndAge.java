package Basics_of_Java;


import java.util.Scanner;

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {  // Adding validation (optional)
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

}

public class PrintNameAndAge {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.close();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        System.out.println("The name of the person is " + person.getName() + " and the age is " +person.getAge() +".");

    }


}
