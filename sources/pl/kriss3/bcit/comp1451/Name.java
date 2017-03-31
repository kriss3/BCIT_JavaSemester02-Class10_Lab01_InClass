package pl.kriss3.bcit.comp1451;

/**
 * Name class to deal with Name objects;
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class10_Lab01_InClass.git
 * @since 2017-03-24
 */
public class Name 
{
	private String firstName;
	private String lastName;
	
	public Name(String firstName, String lastName) throws InvalidArgumentException 
	{
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getFirstName() 
	{	
		return firstName;
	}

	public void setFirstName(String value) throws InvalidArgumentException 
	{
		if(value == null || value.equals(""))
		{
			throw new InvalidArgumentException(String.format("Value of Fist Name param: % is incorrect!", value));
		}
		else
		{
			this.firstName = value;
		}	
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String value) throws InvalidArgumentException 
	{
		if(value == null || value.equals(""))
		{
			throw new InvalidArgumentException(String.format("Value of Last Name param: < %s > is incorrect!", value));
		}
		else
		{
			this.lastName = value;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s", firstName, lastName);
	}

}
