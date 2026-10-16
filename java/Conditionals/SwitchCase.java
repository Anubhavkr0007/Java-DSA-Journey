package Conditionals;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1 :
                System.out.print("Monday");
                break;
            case 2 :
                System.out.print("Tuesday");
                break;

            case 3 :
                System.out.print("Wednesday");
                break;

            default:
                System.out.print("invalid day");
        }
    }
}

            // Output: Wednesday