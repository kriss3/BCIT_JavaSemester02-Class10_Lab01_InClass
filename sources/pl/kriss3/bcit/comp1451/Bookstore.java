package pl.kriss3.bcit.comp1451;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bookstore 
{
	private List<Book> listOfBooks;
	
	public Bookstore() throws InvalidBookDateException, InvalidArgumentException
	{
		listOfBooks = new ArrayList<Book>();
		addBook();
	}
	
	private void addBook() throws InvalidBookDateException, InvalidArgumentException
	{
		listOfBooks.add(new Book("Sidney", "Sheldon", "The Master of the Game", 1997));
	}
	
	public void displayBooks()
	{
		System.out.println("Before Sort !");
		for (Book b : listOfBooks) 
		{
			System.out.println(b.toString());
		}
		
		Collections.sort(listOfBooks);
		
		for(Book b1 : listOfBooks)
		{
			System.out.println(b1.toString());
		}
	}
}
