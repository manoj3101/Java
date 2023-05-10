package week2.day3;

public class EmployeeDetails {
	public void printEmployeeName(String empName) {
		System.out.println("Name " +empName );
	}
	public void printEmpId(int empId) {
		System.out.println("EmpId: " +empId );
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address:" +empAddress);
	}
	public void  printEmployeeSalary(double empSalary) {
		System.out.println("Salary:" +empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile Number:" +mobNum);
	}

	public static void main(String[] args) {
		EmployeeDetails employee = new EmployeeDetails();
		
		employee.printEmployeeName("Madav");
		employee.printEmpId(215);
		employee.getEmployeeAddress("Chennai");
		employee.printEmployeeSalary(30000);
		employee.printEmployeeMobileNumber(9597168039L);

	}

}
