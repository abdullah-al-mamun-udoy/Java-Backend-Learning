package Arrays_and_String;

import java.util.Scanner;

public class CheckSortedArray {

    public static int Sorted(int[] arr, int n){

        int ans = 0;
        for(int  i = 1; i < n; i++){
            ans = arr[i-1] - arr[i];
            if(ans>0){
                return 0;
            }
        }
        return 1;


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i <n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = Sorted(arr,n);
        System.out.println(ans);



    }
}
