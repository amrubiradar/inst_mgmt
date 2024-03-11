package in.ashokit.beans;

public class DebitCardPayment implements IPayment{

	public DebitCardPayment()
	{
		System.out.println("Debitcard payment::Contructor");
	}
	
	@Override
	public boolean payBill(double amt) {
		System.out.println(" Debitcard in processing");
		return true;
	}

}
