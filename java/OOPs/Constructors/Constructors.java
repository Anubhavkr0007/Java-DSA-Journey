/*
A Constructors is a block of codea similar to the method.
It is called when an instance of the class is created.

It is a special type of method which ia used to inialize the object.
Every time an object is created using the new() keyword atleast one
constructor is called.
*/


package OOPs.Constructors;
class Student {

        String name = "Anubhav";
        int age = 21;
    }
    public class Constructors {
    
    public static void main(String[] args){
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);

    }
}

/*
Output:
Anubhav
21
*/