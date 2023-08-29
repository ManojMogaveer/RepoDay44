package Abstraction;
interface GpayCompany
{
	void Rechargeplans();
	void Amtdetuct();
	void ConirmationMsg();	
}
class Airtel implements GpayCompany
{
	public void Rechargeplans()
	{
		System.out.println("Show the Recharge Plans");
	}
	public void Amtdetuct()
	{
		System.out.println("Amount is deducted");
	}
	public void ConirmationMsg()
	{
		System.out.println("Recharge Successfull");
	}
}

class Jio implements GpayCompany
{
	public void Rechargeplans()
	{
		System.out.println("Show the Recharge Plans");
	}
	public void Amtdetuct()
	{
		System.out.println("Amount is deducted");
	}
	public void ConirmationMsg()
	{
		System.out.println("Recharge Successfull");
	}
}

class GpayApplication
{
	GpayCompany RechargeViaApp(char opearatr)
	{
		if(opearatr=='G')
		{
			return new Airtel();
		}
		else
		{
			return new Jio();
		}
	}
}

public class Recharge {
	
	public static void main(String[] args) 
	{
		GpayApplication RC = new GpayApplication();
		GpayCompany GP = RC.RechargeViaApp('G');
		GP.Rechargeplans();
		GP.Amtdetuct();
		GP.ConirmationMsg();
	}


}
