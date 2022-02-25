import java.text.DecimalFormat;
/**
 * Class Name:		RetailCustomer
 * Purpose 			This object will represent a RetailCustomer
 * Coder:			Kyler Wigle
 * Date:			February 8th, 2022
 */

public class RetailCustomer extends Customer
{
	DecimalFormat df = new DecimalFormat("###,###.##");
	
	private double totalPurchases;
	

	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases)
	{
		super(firstName, lastName, customerLevel);
		this.totalPurchases = totalPurchases;
		
	}
	
	public double getTotalPurchases()
	{
		return totalPurchases;
	}



	public void setTotalPurchases(double totalPurchases)
	{
		this.totalPurchases = totalPurchases;
	}


	/*Method Name: Incentives
	*Purpose: Calculates incentives for RetailCustomer
	*Accepts: 
	*Returns: Double
	*/
	@Override
	public double incentives()
	{
		return totalPurchases * findDiscountRate() / 100;
	}
	
	/*Method Name: findDiscountRate
	*Purpose: Calculates discount rate for Retail Customer
	*Accepts: 
	*Returns: 
	*/
	public int findDiscountRate()
	{
		if(totalPurchases > 10000)
		{
			return 15;
		}
		else if(totalPurchases > 5000)
		{
			return 10;
		}
		else if(totalPurchases > 1000)
		{
			return 5;
		}
		return 0;
	}
	
	/*Method Name: toString
	*Purpose: Prints a table for RetailCustomer information
	*Accepts: 
	*Returns: String
	*/
	@Override
	public String toString()
	{
		return getCustomerID() + ", " + getFirstName() + " " + getLastName() + "\n" + getCustomerLevel()+ "\n" 
				+ "Total Purchases:     $" + df.format(totalPurchases) + "\n" + "Discount Rate:       " + findDiscountRate() + "%" + "\n" + "Discount Incentive:  $"
				+ df.format(incentives()) + "\n" + "Net Purchases:       $" + df.format((totalPurchases - incentives()));
		
	}
	
	
}
