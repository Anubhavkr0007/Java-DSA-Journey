package PatternPrinting.Alphabetic;

import java.util.Scanner;

public class Rtriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the n: ");
             int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >=i; j--) {
                    System.out.print((char)(i + 64) + " ");
                }
                System.out.println();
            }
        }
    }
}

/*
Output:
enter the n: 4
A A A A
B B B
C C
D

*/