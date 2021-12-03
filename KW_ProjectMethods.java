
import java.util.Scanner;

/*
 * Program Name:     KW_ProjectMethods.java
 * Purpose:			 Methods used in the project
 * Coder:            Kyler Wigle
 * Date:             Nov 19, 2021
*/

public class KW_ProjectMethods
{

	/*
	 *	Method Name:	getNextSeries
	 *  Purpose:		Replace
	 *	Accepts:		Scanner
	 * 	Returns:		Array
	*/
	public static int[] getNextSeries(Scanner fileScnr)
	{	
		String input = fileScnr.nextLine();
		String[] ticketsArray = input.split(",");
		
		int[] tickets = new int[ticketsArray.length];
		
		for (int i = 0; i < ticketsArray.length; i++)
		{
			tickets[i] = Integer.parseInt(ticketsArray[i]);	
		}
		return tickets; 
	} // End getNextSeries
	
	
	
	/*
	 *	Method Name:	countMatchingNumbers
	 *  Purpose:		Counts the amount of winning numbers
	 *	Accepts:		int[]
	 * 	Returns:		int
	*/
	public static int countMatchingNumbers(int[] tickets, int[] winners)
	{
		int count = 0;
		for (int i = 0; i < winners.length; i++)
		{
			for (int k = 0; k < tickets.length; k++)
			{
				if (tickets[i] == winners[k])
				{
					count++;
				}
			}
		}

		return count;
	} // End countMatchingNumbers
	
	
	
	/*
	 *	Method Name:	formatTicketNumbers
	 *  Purpose:		Replace
	 *	Accepts:		
	 * 	Returns:		void
	*/
	public static String formatTicketNumbers(int[] array)
	  {
	  	String formatTicket = "";
	  	
	  	for (int i = 0; i < array.length; i++)
	  	{
	  		formatTicket += array[i];
	  		if(i < array.length -1)
	  		{
	  			formatTicket += ", ";
	  		
	  		} // end if
	  	} // end for loop
	  		return formatTicket;	
	  } // end method
	
	
	
}
