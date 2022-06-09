package DSA_1;

import java.util.Scanner;

public class even_or_not {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = inp.nextInt();
        if ( i % 2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
