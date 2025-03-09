package Dsa;

import java.util.*;

public class FirstMissingPositive {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i =0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int a = 1;
        for(int i =0 ;i< arr.length;i++){
            if(arr[i]>0){
                if(a!= arr[i]){
                    System.out.println("ok " +a);
                }
                a++;

            }

        }
        System.out.println(a);




    }
}
