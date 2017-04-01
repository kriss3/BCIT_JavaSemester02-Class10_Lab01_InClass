package pl.kriss3.bcit.comp1451;

/**
 * Book class 
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class10_Lab01_InClass.git
 * @since 2017-03-24
 * @throws InvalidBookDateException when year is outside max boundry;
 * @throws InvalidArgumentException when argument null or empty;
 */
public class Book implements Comparable<Book>
{
	//private Name authorName;
	public static final int MAX_YEAR_PUBLISHED = 2016;
	private String firstName;
	private String lastName;
	protected String bookTitle;
	private int yearPublished;
	
	public Book(String firstName, String lastName, String bookTitle, int yearPublished)  
			throws InvalidBookDateException, InvalidArgumentException
	{
		setFirstName(firstName);
		setLastName(lastName);
		setBookTitle(bookTitle);
		setYearPublished(yearPublished);
	}
	
	public final String getFistName()
	{
		return this.firstName;
	}
	
	public final void setFirstName(String value) 
	{
		this.firstName = value;
	}
	
	public final String getLastName()
	{
		return this.lastName;
	}
	
	public final void setLastName(String value) 
	{
		this.lastName = value;
	}
	
	public final String getBookTitle() 
	{
		return bookTitle;
	}
	
	public final void setBookTitle(String bookTitle) throws InvalidArgumentException
	{
		if(bookTitle == null || bookTitle.equals(""))
		{
			throw new InvalidArgumentException(String.format("Parameter for this method is: < %s > and it is invalid !", bookTitle));
		}
		else
		{
			this.bookTitle = bookTitle;
		}
	}
	
	public final int getYearPublished() 
	{
		return yearPublished;
	}
	
	public final void setYearPublished(int value) throws InvalidBookDateException
	{
		if(value < 0 || value > MAX_YEAR_PUBLISHED)
		{
			throw new InvalidBookDateException(String.format("The year published: < %s > and it is invalid!", value));
		}
		else
		{
			this.yearPublished = value;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (!(obj instanceof Book))
			return false;
		
		
		Book other = (Book) obj;
		if (bookTitle == null) 
		{
			if (other.bookTitle != null)
				return false;
		} 
		else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (firstName == null) 
		{
			if (other.firstName != null)
				return false;
		} 
		else if (!firstName.equals(other.firstName))
			return false;
		
		if (lastName == null) 
		{
			if (other.lastName != null)
				return false;
		} 
		else if (!lastName.equals(other.lastName))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}
	
	@Override 
	public int compareTo(Book book)
	{
		return book.getYearPublished() - this.getYearPublished();
	}
	
	@Override
	public String toString()
	{
		return String.format("----------------------------\n"
				+ "Author FName: %s\nAuthor LName: %s\nBook Title: %s\nPublished on: %d\n"
				+ "---------------------------\n"
				, firstName, lastName, bookTitle, yearPublished);
	}
}
