package PatternPrinting.StarPattern;

import java.util.Scanner;

public class basic{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number of row: ");
            int rows = sc.nextInt();

            System.out.print("Enter the no. of cols: ");
            int cols = sc.nextInt();

            for (int i = 1; i <=rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    System.out.print(" * ");
                    
                }
                System.out.println();
                
            }
        }

    }
}

/*
Output:
enter the value of row: 2
enter the value of cols: 2
 * *
 * *
*/