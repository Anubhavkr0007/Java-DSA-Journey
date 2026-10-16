package PatternPrinting.StarPattern;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the n: ");

            int n = sc.nextInt();

            for (int i = 0; i <=n; i++) {
                for (int j = n-1; j >= i; j--) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
       
    }
}
/*
Output:
enter the n: 4

       *
     * *
   * * *
 * * * *
*/