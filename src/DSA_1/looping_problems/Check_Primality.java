package DSA_1.looping_problems;

import java.util.Scanner;

public class Check_Primality {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n ;
        n = inp.nextInt();

        int div = 2;
       boolean isPrime = true;
       while (div <= n/2 ) {
           if ( n% div ==0){
               isPrime =false;
           }
           div++;
       }
       if(isPrime){
           System.out.println("Prime");
       }else {
           System.out.println("Composite");
       }
    }
}
