	class customer
	{
		private double Balance,Interest;
		private static double IntRate;
	 customer(double amount)
	{
		this.Balance=amount;
	}
	static void annualInt(double rate)
	{
		IntRate=rate;
	}
	void calculate()
	{
		Interest=(Balance*IntRate/12)/100;
		Balance=Balance+Interest;
	}
	void print()
	{
		System.out.println("Your Balance: "+Balance);
	}
}
	class SavingsAccount{
	public static void main(String[]args)
	{
		customer cu1=new customer(23453);	
		customer cu2=new customer(32654);
		System.out.println("Balance before Interest: ");
		cu1.print();
		cu2.print();
		System.out.println("Balance after 4% Interest: ");
		customer.annualInt(4);
		cu1.calculate();
		cu1.print();
		cu2.calculate();
		cu2.print();

		System.out.println("Balance after 5% Interest: ");
		customer.annualInt(5);
		customer.annualInt(4);
		cu1.calculate();
		cu1.print();
		cu2.calculate();
		cu2.print();
}
}
