
package Basics_of_Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FindCharacterCase {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println();  // Lowercase letter
        } else {
            System.out.println(-1); // Not an alphabet
        }
    }

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char ch = (char) br.read();
//
//        if (ch >= 'A' && ch <= 'Z') {
//            System.out.println(1);
//        } else if (ch >= 'a' && ch <= 'z') {
//            System.out.println(0);
//        } else {
//            System.out.println(-1);
//        }
//    }
}
