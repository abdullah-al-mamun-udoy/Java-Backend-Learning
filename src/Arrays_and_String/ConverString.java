package Arrays_and_String;

import java.util.Scanner;

public class ConverString {

    public static void main(String[] args){



        Scanner sc = new Scanner(System.in);
        int t = 3;
        while(t>0){
            String s = sc.nextLine();
            StringBuilder modifiedString = new StringBuilder(s);

            Boolean b = true;

            for (int i =0; i<s.length();i++){
                char currentChar = modifiedString.charAt(i);
                if (Character.isWhitespace(currentChar)) {
                    b = true;
                    continue;
                }
                if(Character.isLowerCase(s.charAt(i)) && b){
                    System.out.println(modifiedString.charAt(i));
                    char newChar = (char) (modifiedString.charAt(i) -32 );
                    modifiedString.setCharAt(i, newChar);
                    b = false;
                }

            }
            System.out.println(modifiedString);
            t--;
        }



    }
}
