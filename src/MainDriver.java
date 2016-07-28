import java.util.*;

public class MainDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int itemSelect;
		double creditAmt = 0.00;
		double debitAmt;
		double balAmt;
		
		Credit creditApp = new Credit(creditAmt);
		Debit debitApp = new Debit();

		System.out.println("Select one of the below.");
		System.out.println("Credit = 1");
		System.out.println("Debit = 2");
		
		Scanner input = new Scanner(System.in);
		Scanner creditInput = new Scanner(System.in);
		Scanner debitInput = new Scanner(System.in);
		Scanner balInput = new Scanner(System.in);
		itemSelect = input.nextInt();
		
		if(itemSelect == 1)
		{
			System.out.println("What is your balance: ");
			balAmt = balInput.nextDouble();
			System.out.println("Please enter Credit Amt: ");
			creditAmt = creditInput.nextDouble();
			
			creditApp.setBalanceAmt(balAmt);
			creditApp.setCreditAmt(creditAmt);
			
			System.out.printf("%s %f", "Your new balance is: ", creditApp.sumItems());
		}
	}

}
