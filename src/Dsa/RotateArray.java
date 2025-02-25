package Dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {
    //1 2 3 4 5 6 7 8 9
    //3 4 5 6 7 8 9 1 2
    // k = 2

    public static ArrayList<Integer> ArrayList(ArrayList<Integer> arr, int n, int k){

        ArrayList<Integer> List1 = new ArrayList<>();

        for(int i = 0; i<arr.size()-k; i++){
            List1.add(i, arr.get(k+i));

        }
        for(int i = 0; i<k; i++){
            List1.add(arr.get(i));
        }
        return  List1;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n,input, k;
        n = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = sc.nextInt();
            array.add(input);
        }
        k = sc.nextInt();
        sc.close();

        System.out.println(ArrayList(array,n,k));


    }
}
