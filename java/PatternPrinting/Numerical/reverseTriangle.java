package PatternPrinting.Numerical;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter n: ");
            int n = input.nextInt();
            for (int i = 1; i <=n; i++){
                for (int j = 1; j <= n +1-i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        }
    }

    /*
    Output:
    enter n: 4
    1 2 3 4
    1 2 3
    1 2
    1
    */