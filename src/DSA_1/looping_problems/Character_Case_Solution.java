package DSA_1.looping_problems;

import java.util.Scanner;

public class Character_Case_Solution {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        char ch = inp.next().charAt(0);
        if ( ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        }
            else if (ch>='a' && ch<='z'){
            System.out.println("LowerCase");

        }else {
            System.out.println(-1);
        }
    }
}
