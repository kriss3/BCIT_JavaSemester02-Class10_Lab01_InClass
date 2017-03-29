package pl.kriss3.bcit.comp1451;

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
			throw new InvalidArgumentException(String.format("Value of Last Name param: % is incorrect!", value));
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
