package Basics_of_Java;

import java.util.Scanner;

class ConvertTemp{

    public void result(int s, int e, int w){

        for(int i=s; i<=e;i+=w){
            double a = (i-32)*5/9.0; // Use 9.0 to ensure floating-point division

            if (a < 0) {
                a = Math.ceil(a); // Ceil for positive values

            } else {
                a = Math.floor(a); // Floor for negative values

            }

            System.out.println(i + " " + (int) a);

        }

    }

}

public class TempConvert {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int s,e,w;
        s = sc.nextInt();
        e= sc.nextInt();
        w=sc.nextInt();
        sc.close();
        ConvertTemp ct = new ConvertTemp();
        ct.result(s,e,w);


    }
}
