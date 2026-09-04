class Book {
    String title;
    double price;
}

public class BookMain {
    public static void main(String[] args) {
        // Create one Book object
        Book myBook = new Book();

        // Set both fields directly
        myBook.title = "Clean Code";
        myBook.price = 650.0;

        // Print a single line in the required form
        System.out.println("Title: " + myBook.title + " | Price: Rs " + myBook.price);
    }
}