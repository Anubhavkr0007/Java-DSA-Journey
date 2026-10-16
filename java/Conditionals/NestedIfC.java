package Conditionals;

public class NestedIfC {
    public static void main(String[] args) {
        int age = 16;
        boolean haslicence = true;

        if(age >= 18){
            if(haslicence)
            {
                System.out.print("You Can Drive");
            }
        }
        else
        {
            System.out.print("You Can't Drive");
        }
    }
}

// Output: You Can't Drive
