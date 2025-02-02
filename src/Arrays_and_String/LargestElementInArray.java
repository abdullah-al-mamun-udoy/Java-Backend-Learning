package Arrays_and_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestElementInArray {

//    public static void main( String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n, ans = 0;
//        n = sc.nextInt();
//        for(int i = 0; i<n;i++){
//            int y = sc.nextInt();
//            if(y>ans) ans = y;
//        }
//        sc.close();
//        System.out.println(ans);
//
//    }

    // using the array

    public static int FindLargest(int[] arr, int n){
        int ans = 0;
        for(int x: arr){
            if(x>ans) ans = x;
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0;i<x;i++){
            arr[i] = sc.nextInt();
        }

        int largest = FindLargest(arr,x);
        System.out.println(largest);


    }
}
