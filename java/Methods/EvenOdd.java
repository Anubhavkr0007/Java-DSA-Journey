package Methods;
import java.util.Scanner;
public class EvenOdd {
    
    static String Numbers(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE NUMBER: ");
            int n = sc.nextInt();

            if(n%2 == 0){
                return "Even";
            }else{
                return "Odd";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Numbers());
    }
}
/* 
Output: 
ENTER THE NUMBER: 65
Odd
*/