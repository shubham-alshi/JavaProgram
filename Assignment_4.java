package assignments_package;

public class Assignment_4 {
	
	 void addition(int a, int b, int c ) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	 void addition(int a, double b, int c ) {
		double sum =  a+b+c;
		System.out.println(sum);
	}
	 void addition(int a, int b, double c ) {
		double sum = a+b+c;
		System.out.println(sum);
	}
	 void addition(double a, int b, int c ) {
		double sum = a+b+c;
		System.out.println(sum);
	}
	 void addition(float a, int b, int c ) {
		float sum = a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
	
		Assignment_4 a4 = new Assignment_4();
		a4.addition(112, 3223, 2332);
		a4.addition(2323, 2323.989, 9988);
		a4.addition(2323, 9898, 5678.4567);
		a4.addition(1223.32, 443344, 232343);
		a4.addition(989.34, 3434, 3434);
		
		
		

	}

}
