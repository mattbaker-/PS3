package MainPackage;

public class Test {

	public static void main(String[] args)
	{
		Account a = new Account(1122, 20000);
		a.setAnnualIntRate(4.5);
		
		try {
			System.out.println("Withdrawing $2500...");
			a.withdraw(20500.00);
			System.out.println("\nDepositing $3000...");
			a.deposit(3000.00);
		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}
		
		a.properties();
		
	}

}
