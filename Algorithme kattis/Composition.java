import java.io.*;
import java.util.*;

public class Composition{
	public static void main(String[] args){

		Book book1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book book2 = new Book("Reference", "Herbert");
		Book book3 = new Book("Comple", "Schildt");
		Book book4 = new Book("Complete Reference", "Herbert Schildt");
		Book book5 = new Book("Thinking in Java", "Bruce Eckel");

		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);

		Library library = new Library(books);
		List<Book> bks = library.getAllBooks();
		for(Book b : bks){
			System.out.println("title of the book is "+ b.name+" and the author of the book is "+ b.outhor);
		}
	}
}
class Book{

	String name;
	String outhor;
	Book(String name, String author){
		this.name = name;
		this.outhor = outhor; 
	}
	
}

class Library{

	private final List<Book> Books;
	Library(List<Book> Books){
		this.Books = Books;
	}
	public List<Book> getAllBooks(){
		return Books;
	}
}