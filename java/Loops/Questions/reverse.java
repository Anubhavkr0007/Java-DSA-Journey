package Loops.Questions;

public class reverse {
    public static void main(String[] args) {
        int n = 123;
        int r = 0;
        System.out.println("The original Number is: "+ n);
        while (n > 0) {
            int d = n%10;
            r = r * 10 +d;
            n =  n/= 10;
        }
        System.out.println("The reversed Number is: "+r);
    }
}
/*Output: 
The original number is: 123
the reversed number is: 321
*/