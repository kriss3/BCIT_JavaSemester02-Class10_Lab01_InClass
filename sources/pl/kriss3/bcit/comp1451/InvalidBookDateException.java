package pl.kriss3.bcit.comp1451;

@SuppressWarnings("serial")
public class InvalidBookDateException extends Exception 
{
	public InvalidBookDateException(String param)
	{
		super(param);
	}
}
