import java.text.DecimalFormat;
/**
 * Class Name:		PreferredCustomer
 * Purpose 			This object will represent a PreferredCustomer
 * Coder:			Kyler Wigle
 * Date:			February 8th, 2022
 */

public class PreferredCustomer extends RetailCustomer
{
	DecimalFormat df = new DecimalFormat("###,###.##");
	
	private int cashbackRate;
	
	public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate)
	{
		
		super(firstName, lastName, customerLevel, totalPurchases);
		this.cashbackRate = cashbackRate;
	
		
	
	}
	
	public int getCashbackRate()
	{
		return cashbackRate;
	}




	public void setCashbackRate(int cashbackRate)
	{
		this.cashbackRate = cashbackRate;
	}


	/*Method Name: Incentives
	*Purpose: Calculates incentives for PreferredCustomer
	*Accepts: 
	*Returns: Double
	*/
	@Override
	public double incentives()
	{
		return cashbackRate * (getTotalPurchases() / findDiscountRate() / 100) + getTotalPurchases() * findDiscountRate() / 100;
	}
	
	/*Method Name: toString
	*Purpose: Prints a table for PreferredCustomer information
	*Accepts: 
	*Returns: String
	*/
	@Override
	public String toString()
	{
		return getCustomerID() + ", " + getFirstName() + " " + getLastName() + "\n" + getCustomerLevel() + "\n" 
				+ "Total Purchases:     $" + df.format(getTotalPurchases()) + "\n" + "Discount Rate:       " + findDiscountRate() + "%" + "\n" + "Discount Incentive:  $"
				+ df.format(incentives()) + "\n" + "Net Purchases:       $" + df.format((getTotalPurchases() - incentives())) + "\n" + "Cashback Rate:       " + cashbackRate + "%";
		
	}
	
}
