package Operators;

public class Assignment {
    public static void main(String[] args) {
        int A = 10;         ///Allocates a block of memory for an integer, name A, and stores the value 10 in it.
        System.out.println(A += 5);                 //Addition Assignment Operator.          Output: 15
        System.out.println(A -= 1);                 //Substraction Assignment Operator.      Output: 14
        System.out.println(A *= 2);                 //Multiplication Assignment Operator.    Output: 28
        System.out.println(A /= 2);                 //Division Assignment Operator.          Output: 14


        System.out.println(A++);        //Increment Operator        Output: 11
        System.out.println(A--);        //Decrement Operator        Output: 09
    }
}
