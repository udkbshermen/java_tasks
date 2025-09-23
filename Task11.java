public class Task11 {
    public static void main(String[] args) {
        // instatiates the objects using constructors with different values
        Book newBook1 = new Book("The Kite Runner", "Khaled Hosseini", 2001, 295.75);
        Book newBook2 = new Book("To Fall Again", "Jonaxx", 2020, 799.65);
        Book newBook3 = new Book("Twinkling Watermelon", "Jin Soo-wan", 2023, 485.39);

        //print using toString()
        System.out.println("\nBook 1:\n" + newBook1);
        System.out.println("\nBook 2:\n" + newBook2);
        System.out.println("\nBook 3:\n" + newBook3);
    }
}

// new class named book and declare the following attributes
class Book{
    String title;
    String author;
    int yearPublished;
    double price;

    // constructor that takes 4 parameters that correspond to the attributes above
    Book (String t, String a, int yP, double p){
        title = t;
        author = a;
        yearPublished = yP;
        price = p;
    }

//override toString() to return a string representation of the book object
public String toString(){
    return  "Title: " + title +
            "\nAuthor: " + author +
            "\nYear Published: " + yearPublished +
            "\nPrice: ₱" + price;
}
}
