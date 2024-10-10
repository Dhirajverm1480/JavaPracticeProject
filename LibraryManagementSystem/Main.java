// Library management System 
// Console application to manage a library inventory. Users can add, remove, search and borrow books
// Concepts OOps, Arrays, Collections(Arraylists), File Handling

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void TitleDisplay(String title) {
        System.out.print("| ----------------------------------------------- |");
        System.out.print(" " + title + " ");
        System.out.println("| ----------------------------------------------- |");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        TitleDisplay("Library management system");
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        bookList.add(new Book(1, "The Midnight library", "Fiction Fantasy", 499, "Matt Haig"));
        bookList.add(new Book(2, "Where the Crawdads", "Fiction Mystery", 399, "Delia Owens"));
        bookList.add(new Book(3, "Educated", "Memior", 599, "Tara Westover"));
        bookList.add(new Book(4, "The Silent Patient", "Psychological Thriller", 349, "Alex Michaelides"));
        bookList.add(new Book(5, "Becoming", "Memoir", 699, "Michelle Obame"));
        bookList.add(new Book(6, "Dune", "Science Fiction", 599, "Frank Herbert"));
        bookList.add(new Book(7, "Thw Vanishing Half", "Fiction", 499, "Brit Benett"));
        bookList.add(new Book(8, "Circe", "Fantasy Mythology", 399, "Madeline Miller"));
        // for (Book book : bookList) {
        // System.out.println("BookId " + book.getBookId() + "\nBookName " +
        // book.getBookName() + "\nBookGenre "
        // + book.getGenre() + "\nBookPrice " + book.getPrice() + "\nBookAuthor " +
        // book.getAuthor());
        // }

        while (true) {
            System.out.println("1.Add\t 2.Delete\t 3.Search\t 4.DisplayBook\t 5.AddGroupOfBook");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    TitleDisplay("Add");
                    try {
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        String genre = scanner.nextLine();
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        String author = scanner.next();

                        bookList.add(new Book(id, name, genre, price, author));
                    } catch (Exception e) {
                        System.out.println("Error reading input: " + e.getMessage());
                        scanner.close();
                    }
                    break;
                case 2:
                    TitleDisplay("Delete Book");
                    System.out.print("Enter delete index -> ");
                    int deleteItem = scanner.nextInt();
                    bookList.remove(deleteItem);
                    break;
                case 3:
                    TitleDisplay("Search");
                    System.out.print("Enter thr bookId -> ");
                    int searchBookById = scanner.nextInt();
                    for (Book searchBook : bookList) {
                        if (searchBook.getBookId() == searchBookById) {
                            System.out.println("Id" + searchBook.getBookId() + "\nName -> " + searchBook.getBookName()
                                    + "\nGenre -> " + searchBook.getGenre() + "\nPrice -> " + searchBook.getPrice()
                                    + "\nAuthor -> " + searchBook.getAuthor() + "\n");
                        }
                    }
                    break;
                case 4:
                    TitleDisplay("DisplayBook");
                    for (Book book : bookList) {
                        System.out.println(
                                "BookId " + book.getBookId() + "\nBookName " + book.getBookName() + "\nBookGenre "
                                        + book.getGenre() + "\nBookPrice " + book.getPrice() + "\nBookAuthor "
                                        + book.getAuthor() + "\n");
                    }
                    break;
                case 5:
                    TitleDisplay("Add Multiple Books");
                    System.out.print("Enter the object add count ->");
                    int numOfObject = scanner.nextInt();
                    for (int i = 0; i < numOfObject; i++) {
                        try {
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            String name = scanner.nextLine();
                            String genre = scanner.nextLine();
                            double price = scanner.nextDouble();
                            scanner.nextLine();
                            String author = scanner.next();

                            bookList.add(new Book(id, name, genre, price, author));
                        } catch (Exception e) {
                            System.out.println("Error reading input: " + e.getMessage());
                            scanner.close();
                        }
                        System.out.println(" ");
                    }
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}