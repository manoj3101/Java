package assignment3and4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID : "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
	public void getStudentInfo(String email,long phonenum) {
		System.out.println("Email : "+email);
		System.out.println("Phone no : "+phonenum);
	}
	

	public static void main(String[] args) {
		Students info =new Students();
		info.getStudentInfo(3);
		info.getStudentInfo(3, "Manoj kumar");
		info.getStudentInfo("smanoj3101@gmail.com", 9597168039l);
		

	}

}
