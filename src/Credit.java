
public class Credit 
{
	double creditAmt;
	double balAmt;
	double sumBal;
	
	public Credit(double creditAmt)
	{
		this.creditAmt = creditAmt;
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
