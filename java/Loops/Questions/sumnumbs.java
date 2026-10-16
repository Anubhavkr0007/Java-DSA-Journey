package Loops.Questions;

import java.util.Scanner;

public class sumnumbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("The value of N is: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}
/*
Output:
The value of N is: 6
The sum is: 15 
*/