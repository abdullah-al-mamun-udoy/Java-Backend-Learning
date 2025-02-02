package Arrays_and_String;

import java.util.Scanner;

public class RotateArray {


    public static int[] rotateArray(int[] arr, int n) {
        int firstIndex = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = firstIndex;
        return arr;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i <n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = rotateArray(arr,n);


    }
}
