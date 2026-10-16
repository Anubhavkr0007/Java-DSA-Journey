package Methods;
//Q.Create a number method to calculate the Factorial of a number using loops

public class Fact {
    public static int fact(int n){
        int f =1;
        int i = 1;

        while(i<=n){
            f = f * i;
            i++;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("The factorial of the number: "+ fact(5));
    }
}

//The factorial of the number: 120