import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Arnas on 2017.02.22.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(){

    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void printBooks(){
        for (Book book : books){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : this.books){
            if (StringUtils.included(book.title(), title)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : this.books){
            if (StringUtils.included(book.publisher(), publisher)){
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.year() == year){
                result.add(book);
            }
        }
        return result;
    }
}
