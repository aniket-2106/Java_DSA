package DSA_1;

import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char name = s.next().charAt(0);
        int m1, m2, m3;
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        int avg = (m1 + m2 + m3)/3;
        System.out.println(avg);
        System.out.println(name);
    }
}
