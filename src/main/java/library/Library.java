package library;
public class Library {
    public static void main(String[] args) {
        Author author = new Author("Ion Creanga", "Ion_Creanga@gmail.com");

        Book book = new Book("Amintiri din copilarie", 1892, author, 13.58);
        System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON) by " + book.getAuthor().getName() + " published in " + book.getYear() + ".");
    }
}
