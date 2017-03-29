package pl.kriss3.bcit.comp1451;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Class 10 Lab 01 Start ...");
		
		try 
		{
			Bookstore bs = new Bookstore();
			bs.displayBooks();
		} 
		catch (InvalidBookDateException | InvalidArgumentException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
