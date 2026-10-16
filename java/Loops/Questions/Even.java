package Loops.Questions;

public class Even {
    public static void main(String[] args) {

        System.out.print(" The numbers are: ");

        for (int i = 0; i <=50; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
/*Output:
The numbers are: 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50
 */