package PatternPrinting.Alphabetic;
import java.util.Scanner;
public class triangle {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the n: ");

            int n = sc.nextInt();

            for (int i = 0; i <=n; i++) {
                for (int j = n-1; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print((char)(i + 64) + " ");
                }
                System.out.println();
            }
        }
       
    }
}
/*
Output:
    A
  B B
C C C
*/