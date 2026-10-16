package Methods;
//Q. Write a Method to find and return the greater of two numbers

public class MaxofTwo {
    static int max(int a, int b){

        if(a>b){
            return a;

        }else if(b>a){
            return b;

        }else{
            return 0;
        }
    }
    public static void main(String[] args) {

        System.out.println("The max value is: "+ max(78,66));
    }
}

/*
Output:
The max value is: 78
*/