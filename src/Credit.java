
public class Credit 
{
	private double creditAmt;
	private double balAmt;
	private double sumBal;
	
	public Credit(double creditAmt, double currBal)
	{
		this.creditAmt = creditAmt;
		balAmt = currBal;
	}
	
	public void setCreditAmt(double creditAmt)
	{
		this.creditAmt = creditAmt;
	}
	
	public void setBalanceAmt(double balAmt)
	{
		this.balAmt = balAmt;
	}
	
	public double sumItems()
	{
		sumBal = this.creditAmt + this.balAmt;
		return sumBal;
	}
	
	public double getSumAll()
	{
		return sumItems();
	}
}
