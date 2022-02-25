
/**
 * Class Name:		Customer
 * Purpose 			This object will represent a customer
 * Coder:			Kyler Wigle
 * Date:			February 8th, 2022
 */

public abstract class Customer
{
	private String firstName;
	private String lastName;
	private String customerID;
	private String customerLevel;
	
	public  Customer(String firstName, String lastName, String customerLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		setCustomerID();
		this.customerLevel = customerLevel;
		
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getCustomerID()
	{
		return customerID;
	}

	private void setCustomerID()
	{
		
		String firstFour = "";
		String numbers = "";
		String X = "";
		
		if (lastName.length() > 4)
		{
			firstFour = lastName.substring(0, 4);
			int extraLetters = lastName.length() - 4;
			
			for(int i = 0; i < extraLetters; i++)
			{
				X += "X";
			}
			
		}
		else
		{
			firstFour = lastName;
		}
		
		 
		
		for (int i = 0; i < 4; i++)	
		{
			numbers += ((int)(Math.random() * (9 - 0 + 1) + 0));
		}
		
		this.customerID = firstFour.toUpperCase() + X + "-" + numbers;
		
	}

	public String getCustomerLevel()
	{
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel)
	{
		this.customerLevel = customerLevel;
	}
	
	/*Method Name: Incentives
	*Purpose: Setting up incentives for subclasses
	*Accepts: 
	*Returns:
	*/
	public abstract double incentives();
	
	
	/*Method Name: toString
	*Purpose: This will return customer ID and name
	*Accepts: 
	*Returns: String
	*/
	public String toString()
	{
		return customerID + ", " + firstName + " " + lastName;
	}
	
	

}

