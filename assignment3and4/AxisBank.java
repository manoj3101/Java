package assignment3and4;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit Account");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
