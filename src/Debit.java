
public class Debit 
{
	private double currentBal;
	private double debitBal;
	
	public Debit(double debBal, double currBal)
	{
		currentBal = currBal;
		debitBal = debBal;
	}
	
	public void setDebitVal(double debBal)
	{
		debitBal = debBal;
	}
	
	public void setCurrentBal(double currBal)
	{
		currentBal = currBal;
	}
	
	public double calcBal()
	{
		double newBal;
		
		newBal = currentBal - debitBal;
		return newBal;
	}
}
