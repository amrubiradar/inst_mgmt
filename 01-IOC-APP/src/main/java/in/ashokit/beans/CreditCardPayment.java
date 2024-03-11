package in.ashokit.beans;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment()
	{
		System.out.println("Creditcard payment::Contructor");
	}

	@Override
	public boolean payBill(double amt) {
		System.out.println(" Creditcardpayment  in processing");
		return true;
	}

}
