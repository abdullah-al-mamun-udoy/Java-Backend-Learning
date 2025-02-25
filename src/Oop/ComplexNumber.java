package Oop;

import java.util.Scanner;

public class ComplexNumber {
    int real, imag;

    ComplexNumber(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    public void plus(ComplexNumber c) {
        this.real += c.real;
        this.imag += c.imag;
    }
    public void multiply(ComplexNumber c) {
        int newReal = this.real * c.real - this.imag * c.imag;
        int newImag = this.real * c.imag + this.imag * c.real;
        this.real = newReal;
        this.imag = newImag;
    }
    public void print() {
        System.out.println(real + " + i" + imag);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // Input real and imaginary parts for C1
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        ComplexNumber C1 = new ComplexNumber(r1, i1);

        // Input real and imaginary parts for C2
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        ComplexNumber C2 = new ComplexNumber(r2, i2);

        // Input choice: 1 for plus, 2 for multiply
        int choice = sc.nextInt();
        sc.close();

        if (choice == 1) {
            C1.plus(C2);
            C1.print();
        } else if (choice == 2) {
            C1.multiply(C2);
            C1.print();
        }






    }
}
