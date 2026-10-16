package Loops.Questions;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int f = 1;
        int i = 1;

        while(i<=n){
            f = f * i;
            i++;
        }
        System.out.print("The factorial of " + n + " is: "+ f );
    }
}

/*Output:
The Factorial of 5 is: 120
*/