package library;

import java.util.Scanner;

public class LibraryDemo implements Coomande {
        private static Scanner scanner = new Scanner(System.in);
        private static BookStorage bs = new BookStorage();


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun){
            Coomande.printCoomande();
            String coomand = scanner.nextLine();
            switch (coomand){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bs.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bs.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bs.getBookByMaxPrice());
                    break;
                case SEARCH_BOOK_BY_PRICE:
                    System.out.println("Please input frist price");
                    String start = scanner.nextLine();
                    System.out.println("Please input last price");
                    String end = scanner.next();
                    bs.getBookByPrice(start,end);
                    break;
                case DELETE_BOOK_BY_ID:
                    System.out.println("Plese input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    bs.deleteById(id);
                    break;
                default:
                    System.err.println("Wrong coomand! Try again");
            }

        }


    }

    private static void addBook() {
        System.out.println("Please input book's title");
        String  bookTitle = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String  authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        double  price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(bookTitle,authorName,price);
        bs.add(book);
        System.out.println("Book added successfully ");
    }
}
