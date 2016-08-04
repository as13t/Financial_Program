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
		MainGui createGui = new MainGui();
		LoginPage loginGui = new LoginPage();
		
		loginGui.createFrame();
		
	}

}
