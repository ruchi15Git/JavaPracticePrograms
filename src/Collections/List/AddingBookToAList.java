package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class AddingBookToAList {
    public static void main(String[] args){
        List<Book> bookList= new ArrayList<>();
        Book bookList1=new Book(1,"C","Yashwant kanetkar",3);
        Book bookList2=new Book(2,"Master your Emotions","Marricr",6);
        Book bookList3=new Book(3,"Think like a monk","Jay shetty",3);
        bookList.add(bookList1);
        bookList.add(bookList2);
        bookList.add(bookList3);
        for(Book b:bookList){
            System.out.println(b.id +", "+b.bookName+", "+", "+b.author+", "+b.quantity);
        }

    }
}

class Book{
    int id;
    String bookName, author;
    int quantity;
    Book (int id, String bookName, String author, int quantity){
        this.id=id;
        this.bookName=bookName;
        this.author=author;
        this.quantity=quantity;
    }
}