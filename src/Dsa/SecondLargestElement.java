package Dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

    public static int sort(int[] arr, int n){
        int flag =0;
        //5 4 3 2 1
        for(int i =0 ;i<n-1;i++){
            int smallestIndex = i;
            for(int j = i+1; j<n; j++){

                if(arr[j]<arr[smallestIndex]){
                    smallestIndex = j;
                }

            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;

        }
//        for(int i =0 ;i<n;i++){
//            System.out.println(arr[i]);
//        }
              //  -58 62 -53 -61 -21 17
        //-61 -58 -53 -21 17 62

        for(int i = n-1; i > 0; i--){
            if(arr[i] != arr[i-1]){
                return arr[i-1];
            }
            else{
                flag =1;

            }
        }
        if(flag == 1){
            return -1;
        }

        return 0;



    }

    public static void findSecondLargest(int[] arr, int n){

        System.out.println(sort(arr,n));


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int  i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        findSecondLargest(arr,n);

    }
}
