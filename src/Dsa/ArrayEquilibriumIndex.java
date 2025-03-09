package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquilibriumIndex {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int s=0, ss =0, ans = Integer.MAX_VALUE;

        int [] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
            s+= arr[i];
        }
        Arrays.sort(arr);
        for (int i =0; i<n;i++){
           System.out.println(arr[i]);
        }


        for(int i = 0; i <n;i++){
            s-=arr[i];
            if(s==ss){
                ans = i;
                break;
            }
            ss+=arr[i];

        }
        if(ans == Integer.MAX_VALUE) ans = -1;


    }
}
