
/*
Types of Constructors-----
1. Default Constructors---> A Constructors is called "Default" Constructor when
                            it doesn't have any parameters.
                            
                            The Default constructor is used to provide the default
                            values depending upon the type of the object ex: Null, 0... etc.
*/

package OOPs.Constructors;
class bike{
    bike(){
        System.out.println("Bike is created.");
    }
}
public class DefaultC {
    public static void main(String[] args){
        bike b = new bike();

        
    }
}

/*Output:
 Bike is created.
 */
