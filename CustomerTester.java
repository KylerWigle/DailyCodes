import java.text.DecimalFormat;
/**
 * Class Name:		CustomerTester
 * Purpose 			This program will test the customer objects
 * Coder:			Kyler Wigle
 * Date:			February 8th, 2022
 */

public class CustomerTester
{

	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		//Introduction
		System.out.println("Welcome to the Customer tester!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
		System.out.println("---------------------------------------------------------------------------------------");
		
		// Create Customer Array
		Customer customerArray[] = new Customer[3];
		
		//Create 3 Customer Objects
		Customer mike = new BusinessCustomer("Mike", "Holmes", "Buisness Customer", "Home Depot", 10, 3105.50);
		
		Customer dev = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200);
		
		Customer wei = new PreferredCustomer("Wei","Ping","Preffered Customer", 6456.85, 5);
		
		customerArray[0] = mike;
		customerArray[1] = dev;
		customerArray[2] = wei;
		
		for(int i = 0; i < customerArray.length; i++)
		{
			System.out.println(customerArray[i].toString());
			System.out.println();
		}
		
		for(int i = 0; i < customerArray.length; i++)
		{
			System.out.println(customerArray[i].getFirstName() + " " + customerArray[i].getLastName() + " earns a discount incentive of $" + df.format(customerArray[i].incentives()));
		}
		
		System.out.println();
		
		BusinessCustomer tristan = new BusinessCustomer("Tristan", "Lee", "Buisness Customer","Starbucks", 15, 9875.25); 
		
		RetailCustomer carlos = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
		
		PreferredCustomer arti = new PreferredCustomer("Arti", "Potel", "Preffered Customer", 10450.00, 10);
		
		System.out.println(tristan.toString());
		System.out.println();
		System.out.println(carlos.toString());
		System.out.println();
		System.out.println(arti.toString());
		System.out.println();
		
		tristan.setTotalPurchases(8895);
		tristan.setDiscountRate(12);
		
		carlos.setTotalPurchases(100500);
		
		arti.setTotalPurchases(14987.24);
		arti.setLastName("Patel-Ruhil");
		arti.setCashbackRate(13);
		
		System.out.println(tristan.toString());
		System.out.println();
		System.out.println(carlos.toString());
		System.out.println();
		System.out.println(arti.toString());
		System.out.println();
	}
		

}
