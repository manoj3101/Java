package week2.day1;

public class Mobile {
	String mobileBrandName = "Redmi";
	char mobileLogo = 'M';
	short noOfMobilePiece = 200 ;
	int modelNumber = 12 ;
	long mobileImeiNumber = 68454846584654l;
	float mobilePrice = 15000;
	boolean isDamaged = false;

	public static void main(String[] args) {
		Mobile spec = new Mobile();
		System.out.println(spec.mobileBrandName);
		System.out.println(spec.mobileLogo);
		System.out.println(spec.noOfMobilePiece);
		System.out.println(spec.modelNumber);
		System.out.println(spec.mobileImeiNumber);
		System.out.println(spec.mobilePrice);
		System.out.println(spec.isDamaged);
	}

}
