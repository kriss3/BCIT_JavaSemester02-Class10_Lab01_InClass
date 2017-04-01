package pl.kriss3.bcit.comp1451;

/**
 * Main runner class;
 * @author Krzysztof Szczurowski
 * @since 2017-03-24
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class10_Lab01_InClass.git
 */
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Class 10 Lab 01 Start ...");
		
		Bookstore bs = new Bookstore();
		System.out.println();
		System.out.println("DISPLAY BOOKS");
		bs.displayBooks();
	}
}
