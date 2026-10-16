package PatternPrinting.Numerical;
import java.util.Scanner;
public class Squarestar {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the n: ");
            int n = sc.nextInt();
            for (int i = 1; i<= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
        }
    
    }
}

/*
Output:
enter the n: 3
1 2 3
1 2 3
1 2 3
*/