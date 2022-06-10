package DSA_1.looping_problems;
//Write a program to input an integer N and print the sum of
// all its even digits and sum of all its odd digits separately.
//Digits mean numbers, not the places! That is, if
// the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
import java.util.Scanner;

public class SUM_OF_ODD_EVEN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int evenSum =0 ;
        int oddSum=0;
        while (n > 0){
            int last = n %10;
            if (last % 2==0){
                evenSum = evenSum+last;
            }else {
                oddSum = oddSum+last;
            }
            n = n/10;
        }
        System.out.println("Even-Sum "+ evenSum);
        System.out.println("Odd-Sum "+ oddSum);
    }
}
