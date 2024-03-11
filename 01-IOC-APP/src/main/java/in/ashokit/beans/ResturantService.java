package in.ashokit.beans;



public class ResturantService {
	
	

	
	
	private IPayment payment;
	
	public ResturantService()
	{
		System.out.println("ResturantService:contructor");
	}
	
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
	}
	
	public void processPayment(double amt)
	{
		boolean status=payment.payBill(amt);
		if(status)
		{
			System.out.println("payment complited");
		}
		else
		{
			System.out.println("payment failed");
		}
	}

}
