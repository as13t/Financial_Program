import java.util.*;

public class MainDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int itemSelect;
		double creditAmt = 0.00;
		double debitAmt = 0.00;
		double balAmt = 0.00;
		
		Credit creditApp = new Credit(creditAmt, balAmt);
		Debit debitApp = new Debit(debitAmt, balAmt);

		System.out.println("1) Deposit");
		System.out.println("2) Withdrawal");
		System.out.println("Which would you like to do? ");
		
		Scanner input = new Scanner(System.in);
		Scanner creditInput = new Scanner(System.in);
		Scanner debitInput = new Scanner(System.in);
		Scanner balInput = new Scanner(System.in);
		itemSelect = input.nextInt();
		
		if(itemSelect == 1)
		{
			System.out.println("What is your balance: ");
			balAmt = balInput.nextDouble();
			System.out.println("Please enter Deposit Amount: ");
			creditAmt = creditInput.nextDouble();
			
			creditApp.setBalanceAmt(balAmt);
			creditApp.setCreditAmt(creditAmt);
			
			System.out.printf("%s%.2f", "Your new balance is: $", creditApp.sumItems());
		}
		
		if(itemSelect == 2)
		{
			System.out.println("What is your balance: ");
			balAmt = balInput.nextDouble();
			System.out.println("What amount would you like to withdraw: ");
			debitAmt = creditInput.nextDouble();	
			
			debitApp.setCurrentBal(balAmt);
			debitApp.setDebitVal(debitAmt);
			
			System.out.printf("%s%.2f", "Your new balance is: $", debitApp.calcBal());
		}
	}

}
