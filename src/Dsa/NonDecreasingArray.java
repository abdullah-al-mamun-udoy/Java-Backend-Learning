package Dsa;

import java.util.Scanner;

public class NonDecreasingArray {

    public static boolean isPossible(int[] arr, int n){
        int count = 0;           // Count of modifications required
        int prev = arr[0];       // Simulated previous value in the non-decreasing sequence

        for (int i = 1; i < n; i++) {
            if (arr[i] < prev) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i == 1 || arr[i] >= arr[i - 2]) {
                    prev = arr[i];
                }
                // Otherwise, we simulate modifying the current element by keeping 'prev' unchanged.
                // Essentially, we act as if arr[i] had been raised to prev.
            } else {
                // No violation; update prev normally.
                prev = arr[i];
            }
        }
        return true;



    }
    //-78 -68 -51 -20 187 -182 42 64 66 93
     // 10, 17,31, -167, 5 140, -22 -2 -27 8
// -41 -40 -22 -14 -14 -1 17 59 -130 92
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(isPossible(arr, arr.length)){
            System.out.println(isPossible(arr,arr.length));
        }
        else{
            System.out.println(isPossible(arr,arr.length));
        }

    }
}
