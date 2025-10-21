package library;

public interface Coomande {

    String EXIT = "0";
    String ADD_BOOK = "1";
    String PRINT_ALL_BOOKS = "2";
    String SEARCH_BOOK_BY_TITLE = "3";
    String PRINT_EXPENSIVE_BOOK = "4";
    String SEARCH_BOOK_BY_PRICE = "5";
    String DELETE_BOOK_BY_ID = "6";



    static void printCoomande (){
        System.out.println("Please input "+EXIT+" for EXIT");
        System.out.println("Please input "+ADD_BOOK+" for ADD BOOK");
        System.out.println("Please input "+PRINT_ALL_BOOKS+" for PRINT ALL BOOKS");
        System.out.println("Please input "+SEARCH_BOOK_BY_TITLE+" for SEARCH BOOK BY TITLE");
        System.out.println("Please input "+PRINT_EXPENSIVE_BOOK+" for PRINT EXPENSIVE BOOK");
        System.out.println("Please input "+SEARCH_BOOK_BY_PRICE+" for SEARCH BOOK BY PRICE");
        System.out.println("Please input "+DELETE_BOOK_BY_ID+" for DELETE BOOK BY ID");
    }

}
