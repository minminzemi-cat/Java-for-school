import  java.util.ArrayList;
import java.util.Collections;


public class Exam5_4 {
    public static void main(String[] args) {
        
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Cの絵本","Aさん",500));
        bookList.add(new Book("javaの絵本","bさん",100));
        bookList.add(new Book("phpの絵本","cさん",1000));

        //sort前のbooklistの中身
        System.out.println("sort前のbookListの中身");
        for(Book b : bookList){
            System.out.println(b.title + ":" + b.author + ":" + b.price);
        }

        //priceの安い順に並び替える
        Collections.sort(bookList);

        //sort前のbooklistの中身
        System.out.println("sort後のbookListの中身");
        for(Book b : bookList){
            System.out.println(b.title + ":" + b.author + ":" + b.price);
        }
    }
}
