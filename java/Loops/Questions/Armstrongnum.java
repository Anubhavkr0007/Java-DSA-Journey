package Loops.Questions;

//Q. Check if a number is Armstrong number.

/*
An Armstrong Nmuber is a number that equals the sum of its own digits 
where each digit is raised to the power of the total number of digits in the number.

153: 3 digit number...
1^3 + 5^3 + 3^3
3 + 125 + 9
153
*/
public class Armstrongnum {
    public static void main(String[] args) {
        int n = 153;
        int o = n;
        int s = 0;
        int d;
        do { 
            d = n%10;
            s = s +(d*d*d);
            n = n/10;
        } while (n!=0);

        if(s==o){
            System.out.println(o+" is an Armstrong Number");
        }else{
            System.out.println(o+" is not an Armstrong Number");
        }
    }
}

// Output: 153 is a Armstrong number.