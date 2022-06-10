package DSA_1.looping_problems;


import java.util.Scanner;

public class Multiplication_Table {
    public static void main (String[] args) {
        Scanner inp =new Scanner(System.in);
        int n=inp.nextInt();

        int i=1;
        while(i<=10){
            System.out.println( i * n);
            i++;
        }
    }
}
