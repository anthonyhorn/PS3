package PS3;

public class Test {

	public static void main(String[] args) {
		Account tester = new Account(1122, 20000);
		tester.setAnnualInterestRate(4.5);
		tester.withdraw(2500);
		tester.deposit(3000);
		System.out.println("Balance:"+tester.getBalance()+"\nMonthly Interest:"+tester.getMonthlyInterestRate()+"\nDate Created:"+tester.getDate());		
	} 
}
