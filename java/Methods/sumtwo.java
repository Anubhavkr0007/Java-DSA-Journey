package Methods;
//Q. Sum of Two Numbers:

public class sumtwo {
    public static int twosum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int S = twosum(5, 6);
        System.out.println(" The sum is: " + S);
    }
}

/*
Output:
The sum is: 11
*/