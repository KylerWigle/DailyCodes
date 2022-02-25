import java.text.DecimalFormat;
/**
 * Class Name:		BuisnessCustomer
 * Purpose 			This object will represent a BuisnessCustomer
 * Coder:			Kyler Wigle
 * Date:			February 8th, 2022
 */

public class BusinessCustomer extends Customer
{
	DecimalFormat df = new DecimalFormat("###,###.##");
	
	private String companyName;
	private int discountRate;
	private double totalPurchases;
	
	public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases)
	{
		super(firstName, lastName, customerLevel);
		this.companyName = companyName;
		this.discountRate = discountRate;
		this.totalPurchases = totalPurchases;
		
	}
	
	

	public String getCompanyName()
	{
		return companyName;
	}



	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}



	public int getDiscountRate()
	{
		return discountRate;
	}



	public void setDiscountRate(int discountRate)
	{
		this.discountRate = discountRate;
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
	*Purpose: Calculates incentives for BuisnessCustomer
	*Accepts: 
	*Returns: Double
	*/
	@Override
	public double incentives()
	{
		return totalPurchases * discountRate / 100;
		
		
	}
	
	/*Method Name: toString
	*Purpose: Prints a table for BuisnessCustomer information
	*Accepts: 
	*Returns: String
	*/
	@Override
	public String toString()
	{
		return getCustomerID() + ", " + getFirstName() + " " + getLastName() + "\n" + getCustomerLevel() + " for " + companyName + "\n" 
				+ "Total Purchases:     $" + df.format(totalPurchases) + "\n" + "Discount Rate:       " + discountRate + "%" + "\n" + "Discount Incentive:  $"
				+ df.format(incentives()) + "\n" + "Net Purchases:       $" + df.format((totalPurchases - incentives()));
		
	}
}
