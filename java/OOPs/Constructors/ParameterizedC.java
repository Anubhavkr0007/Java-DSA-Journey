/*
2. Parameterized Constructors----> A constructor which has a specific number of parameters
                                   is called parameterised constructor is used to provide
                                   different values to distinct objects.
 */

package OOPs.Constructors;

class Student1 {
    int id;
    String name;
    Student1(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id +" " + name);
    }
}
public class ParameterizedC {
    public static void main(String[]args){

        Student1 S1 = new Student1(111, "Anubhav");
        Student1 S2 = new Student1(112, "Anshu");
    
            S1.display();
            S2.display();
    }
   

}

/*
Output:
111 Anubhav
112 Anshu
*/