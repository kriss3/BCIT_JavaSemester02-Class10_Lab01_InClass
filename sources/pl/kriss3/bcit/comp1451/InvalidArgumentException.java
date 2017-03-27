package pl.kriss3.bcit.comp1451;

@SuppressWarnings("serial")
public class InvalidArgumentException extends Exception 
{
	public InvalidArgumentException(String ex)
	{
		super(ex);
	}
}