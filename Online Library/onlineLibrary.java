package oops;

import java.util.*;
class library {
    String[] books;
    int noOfBooks;

    //Constructor For Library
    library() {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    //Method for Add Book
    void addBook(String book) {
        this.books[noOfBooks] = book;
        noOfBooks++;
    }

     //Method for Show Available Book
    void showAvailabelBook() {
        System.out.println("Availble books area : ");
        System.out.println();
        for (String book : this.books) {
            if (book == null)
            continue;
            System.out.println(" * " + book);
        }
    }

     //Method for Issue Book
    void issuedBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book " + book + " has been issued");
                this.books[i] = null;
                return;
            }
        }
    }

     //Method for Return Book
    void returnBook(String book) {
        addBook(book);
        System.out.println("Book has been Returned");
    }
}

//Main class
public class onlineLibrary {
    public static void main(String[] args) {
        library centraLibrary = new library();
        //Adding Initial Books 
        centraLibrary.addBook("Think and Grow Rich");
        centraLibrary.addBook("Amazing facts");
        centraLibrary.addBook("life is amazing");
        centraLibrary.addBook("Secret");
        
        //Scannner Method for user
        Scanner sc = new Scanner(System.in);
        char Option = '\0';
        System.out.println("Welcome to Our Online Library ");
        while(Option!='E'){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Enter the option \n A. Issue Book \n B. Return book \n C. Add Book \n D. Show Available Books \n E. Exit");
       // System.out.println("-----------------------------------------------------------------------------");
        
        
        Option = sc.nextLine().charAt(0);
        
        if (Option == 'A') {
            centraLibrary.showAvailabelBook();
            System.out.println("Enter the name of book you want to issue");
            centraLibrary.issuedBook(sc.nextLine());
            continue;
        }

        else if (Option == 'B') {
            System.out.println("Enter the book you want to return");
            centraLibrary.returnBook(sc.nextLine());
            continue;
        }

        else if (Option == 'C') {
            System.out.println("Enter the name of book you want to add in library");
            centraLibrary.addBook(sc.nextLine());
            System.out.println("The Book Has been added");
            continue;
        }

        else if(Option=='D'){
            centraLibrary.showAvailabelBook();
            continue;
        }
        else if (Option == 'E') {
            System.out.println("ThankYou!");
            continue;
        }
        }
        sc.close();

    }
}