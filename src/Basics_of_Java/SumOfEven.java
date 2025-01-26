package Basics_of_Java;


import java.util.Scanner;

class Sum{
    int a = 0;
    public int result(int n){
        for(int i =1; i<=n;i++){
            if(i%2==0){
                a+= i;
            }
        }
        return a;
    }


}


public class SumOfEven {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        Sum s = new Sum();
        System.out.println(s.result(a));



    }
}

