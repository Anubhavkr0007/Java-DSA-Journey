package Methods;
import java.util.Scanner;
public class ReverseNumber {

    public static int reverse(int n){
        int r = 0;

        while(n!= 0){
            int d = n%10;
            r = r * 10 + d;
            n = n/10;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        
        int num = sc.nextInt();
        int result = reverse(num);
        
        System.out.println("Reversed number: " + result);
    }
}
