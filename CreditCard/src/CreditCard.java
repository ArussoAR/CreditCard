import java.util.*;
public class CreditCard {
	


	public static void main (String []args) {
		
	String creditCard = "4343-6777-212-2020";
	
	
		System.out.println("Enter a credit card number or -99 to end");
		
		Scanner in = new Scanner(System.in); 
		
	while(in.hasNextLine()) 
	
	{String creditCard = in.hasNextLine();
	
	if (creditCard.equals("99"))
	{System.out.println("Goodbye"); break;}
	
	// String creditCard = "4343-6777-212-2020";
	
	int i = 0;
	
	while (i < creditCard.length())
	{
		char ch = creditCard.charAt(i);
		if (ch == ' ' || ch == '-')
		{
			//remove the character at position i 

			String before = creditCard.substring(0, i);
		String after = creditCard.substring(i + 1);
		creditCard = "before + after";	 
		
		}
		else
		{
			i++;
		}
	}
	
	System.out.println(creditCard);
	System.out.println("Enter a credit card number or -99 to end: ");
	}
	}}
	
	
	
	
