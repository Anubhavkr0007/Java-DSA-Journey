/*
Constructor Overloading is a technique of having more than
one constructor with different parameters lists.

They are arranged in a way that each constructor performs
specific task.

They are differentiated by the computer by the number of parameters
in the list and their types.


This keyword:
1. this can be used to refer current class instance.
2. this can be used to invoke current class method.
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method called.
5. this can be used as return the current class instance from the method.
*/

package OOPs.Constructors;
    public class ConstructorOverloading{
        static public class Book {
            private String title;
            private String author;
            private double price;

            public Book() {
                this.title = "Unknown";
                this.author = "Unknown";
                this.price = 0.0;
            }

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
                this.price = 0.0;
            }

    
            public Book(String title, String author, double price) {
                this.title = title;
                this.author = author;
                this.price = price;
            }

            public void displayDetails() {
                System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
            }

            public static void main(String[] args) {
        
            Book book1 = new Book();
        
            Book book2 = new Book("Geetanjali", "Rabindranath Thakur");
        
            Book book3 = new Book("The Metamorphosis", "Franz Kafka", 45.99);

            book1.displayDetails();
            book2.displayDetails();
            book3.displayDetails();
        }
    }
}


/*
Title: Unknown, Author: Unknown, Price: $0.00
Title: Geetanjali, Author: Rabindranath Thakur, Price: $0.00
Title: The Metamorphosis, Author: Franz Kafka, Price: $45.99
*/