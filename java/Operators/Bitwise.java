package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5;      //Binary: 0101
        int b = 2;      //Binary: 0010

        //Bitwise AND(&)
        System.out.println(a & b);              //Output: 0

        //Bitwise OR(|)
        System.out.println(a|b);                //Output: 7

        //Bitwise XOR(^)
        System.out.println(a^b);                //Output: 7

        //Bitwise Complement
        System.out.println(~a);                 //Output: -6

        //Left Shift
        System.out.println(a << 1);             //Output: 10

        //Right Shift
        System.out.println(a >> 1);             //Output: 2
    }
}
