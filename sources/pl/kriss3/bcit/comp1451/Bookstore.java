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
		try 
		{
			addBook();
		} 
		catch (InvalidBookDateException|InvalidArgumentException e) 
		{
			e.getMessage();
			e.printStackTrace();
		}
		finally
		{
			//add default book 
			System.out.println("<Finally Block> Something went wrong. Check error log!");
		}
	}
	
	private void addBook() throws InvalidBookDateException, InvalidArgumentException
	{
		listOfBooks.add(new Book("Sidney", "Sheldon", "The Master of the Game", 1997));
		listOfBooks.add(new Book("Philip", "K.Dick", "The Man in the High Castle", 1962));
		listOfBooks.add(new Book("Frank", "McCourt", "Angela's Ashes", 1996));
		listOfBooks.add(new Book("Erich", "Gamma", "Design Patterns", 1994));
		listOfBooks.add(new Book("Stanislaw", "Ulam", "Adventures of a Mathematician", 1983));
		listOfBooks.add(new Book("",null,"",2019));
		
	}
	
	public void displayBooks()
	{
		System.out.println();
		System.out.println("Before Sort !");
		for (Book b : listOfBooks) 
		{
			System.out.println(b.toString());
		}
		
		Collections.sort(listOfBooks);
		
		System.out.println();
		System.out.println("After Sort !");
		for(Book b1 : listOfBooks)
		{
			System.out.println(b1.toString());
		}
	}
}
