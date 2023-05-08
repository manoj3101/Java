package week2.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 9595161565L;
	boolean isPunctured = false;
	String bikeName ="Pulsar ";
	double runningKM = 1000.25;
	

	public static void main(String[] args) {
		TwoWheeler method = new TwoWheeler();
		System.out.println(method.noOfWheels);
		System.out.println(method.noOfMirrors);
		System.out.println(method.chassisNumber);
		System.out.println(method.isPunctured);
		System.out.println(method.bikeName);
		System.out.println(method.runningKM);
        
	}

}
