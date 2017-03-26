package pl.kriss3.bcit.comp1451;

public final class Biography extends Book
{
	private Name subject;

	public Biography(String firstName, String lastName, String bookTitle, int yearPublished, Name subject)
			throws InvalidBookDateException, InvalidArgumentException {
		super(firstName, lastName, bookTitle, yearPublished);
		setSubject(subject);
	}
	
	public Name getSubject()
	{
		return this.subject;
	}
	
	public void setSubject(Name value)
	{
		this.subject = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Biography))
			return false;
		Biography other = (Biography) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		
		if(this.subject.equals(other.subject))
			return true;
		
		return false;
	}
}
