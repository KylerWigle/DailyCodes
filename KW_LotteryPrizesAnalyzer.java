/*
 * Program Name:     KW_LotteryPrizesAnalyzer.java
 * Purpose:			 this program takes in lottery numbers and lists the winners to distribute the
 * 					 prize pool
 * Coder:            Kyler Wigle
 * Date:             Nov 16, 2021
*/

import java.io.*;
import java.util.*; // import Scanner class


public class KW_LotteryPrizesAnalyzer
{


	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		
		// Display a title
		System.out.println("Lottery Prizes Analyzer");
		System.out.println("");

		// Get user input 
		
		System.out.print("Enter the name of the lottery: ");
		String lotteryName = scnr.nextLine();
		
		System.out.print("Enter the amount of money in the prize pool: $");
		double prizeMoney = 0;
		boolean validAmount; 
		
		// Validate prize money
		do 
		{
			prizeMoney = scnr.nextDouble();
			
			validAmount = prizeMoney >= 1000;
			if (!validAmount)
			{
				System.out.print("Please enter an amount $1000 or more: ");

			}
		} while (!validAmount);
		
		// buffer flush
		scnr.nextLine();
		
		// create the File 
		System.out.print("Enter the path for the data file: ");
		String fileName = scnr.nextLine();
		File numbersFile = new File(fileName);
		
		scnr.close();
		
		//Validate the file and create the array
		Scanner fileScnr = null;
		
		try 
		{
			fileScnr = new Scanner(numbersFile);
		}
		catch (FileNotFoundException ex)
		{
			System.out.print("File was not found, Program is quiting");
		}
		
		 ArrayList<String> second = new ArrayList<String>();
	     ArrayList<String> third = new ArrayList<String>();
	    
	        int winnerCount = 0;
	        int secondCount = 0;
	        int thirdCount = 0;
	        int matchingTickets;
	        int prizeWinner= 0;
	        int [] winnerArray = KW_ProjectMethods.getNextSeries(fileScnr);
	        String winningNumbers = KW_ProjectMethods.formatTicketNumbers(winnerArray);
	        
			while (fileScnr.hasNextLine())
	        {
	        	winnerCount++;
	            int[] ticketsArray = KW_ProjectMethods.getNextSeries(fileScnr);
	            matchingTickets = KW_ProjectMethods.countMatchingNumbers(winnerArray, ticketsArray);
	            
	            if ((matchingTickets == ticketsArray.length))
	            {
	                prizeWinner++;
	            }
	            else if (matchingTickets == ticketsArray.length-1) {
	                second.add(KW_ProjectMethods.formatTicketNumbers(ticketsArray));
	                secondCount ++;
	                
	            }
	            else if (matchingTickets == ticketsArray.length-2) {
	                third.add(KW_ProjectMethods.formatTicketNumbers(ticketsArray));
	                thirdCount++;
	            }
	            
	        }
	    
	        final double winnerPercent = 85.0;
	        final double secondPercent = 7.0;
	        final double thirdPercent = 8.0;
	        
	        double firstPrize = prizeMoney * winnerPercent / 100;
	        double secondPrize = prizeMoney * secondPercent / 100;
	        double thirdPrize = prizeMoney * thirdPercent / 100;
	        
	        double firstPerTicket = firstPrize / prizeWinner;
	        double secondPerTicket = secondPrize / secondCount;
	        double thirdPerTicket = thirdPrize / thirdCount;
	        
	       
	        //Generate a report 
	        System.out.println("\nLottery Prizes Report");
	        System.out.println("----------------------------------------");
	        //Print lottery name
	        System.out.println("    Lottery Name:      " + lotteryName);
	        //Print lottery prize pool
	        System.out.printf("    Total Prize Pool:  $%.2f\n", prizeMoney);
	        //Print number of tickets
	        System.out.println("    Number of tickets: " + winnerCount);
	        //Print winning numbers
	        System.out.println("    Winning Numbers:   " + winningNumbers);
	        System.out.println("");
	        
	        // Report for Grand Prize
	        System.out.print("Grand prize winners  (all numbers match)...\n");
	        System.out.println("    Number of winners:  " + prizeWinner );
	        System.out.println("    % of prize poll:    " + winnerPercent);
	        System.out.printf("    Total prize value:  $%.2f\n", firstPrize);
	        System.out.printf("    Prize per ticket:   $%.2f\n", firstPerTicket);
	        System.out.println("");    
	      
	        // Report for Second Prize 
	        System.out.print("Second prize winners  (all numbers match)...\n");
	        System.out.println("    Number of winners:  " + secondCount );
	        System.out.println("    % of prize pool:    " + secondPercent);
	        System.out.printf("    Total prize value:  %.2f\n", secondPrize);
	        System.out.printf("    Prize per ticket:   $%.2f\n", secondPerTicket);
	        System.out.print("    Ticket Numbers:     ");
	        for (int i = 1; i <= second.size(); i++) //print out ticket numbers
			{
				System.out.print(second.get(i-1));
				System.out.print("    ");
				if (i % 2 == 0)
	      {
	        System.out.println();
	        System.out.print("                     ");
	      }
			}

	        
	        System.out.println(""); 
	        
	        //Report for Third Prizes
	        System.out.print("Third prize winners  (all numbers match)...\n");
	        System.out.println("    Number of winners:  " + thirdCount );
	        System.out.println("    % of prize pool:    " + thirdPercent);
	        System.out.printf("    Total prize value:  %.2f\n", thirdPrize);
	        System.out.printf("    Prize per ticket:   $%.2f\n", thirdPerTicket);
	        System.out.print("    Ticket Numbers:     ");
	        for (int i = 1; i <= third.size(); i++) //for loop to print out ticket number
			{
				System.out.print(third.get(i-1));
				System.out.print("     ");
				if (i % 2 == 0)
	      {
	        System.out.println();
	        System.out.print("                        ");
	      }
			}

	        
	        
	        System.out.println(""); 
	}
}






 