package assignment3and4;

public class BankInfo {
	public void saving() {
		System.out.println("Savings Account");
	}
	public void fixed() {
		System.out.println("Fixed Account");
	}
	public void deposit() {
		System.out.println("Deposit Account");
	}
	

	public static void main(String[] args) {
		BankInfo info =new BankInfo();
		info.saving();
		info.fixed();
		info.deposit();

	}

}
