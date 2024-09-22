package assignments_package;

public class Assignment_3 {
	
	static void addition(int a, int b, int c ) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	static void addition(int a, double b, int c ) {
		double sum =  a+b+c;
		System.out.println(sum);
	}
	static void addition(int a, int b, double c ) {
		double sum = a+b+c;
		System.out.println(sum);
	}
	static void addition(double a, int b, int c ) {
		double sum = a+b+c;
		System.out.println(sum);
	}
	static void addition(float a, int b, int c ) {
		float sum = a+b+c;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		addition(100,200,300);
		addition(100,9009.3344,300);
		addition(100,200,56789.098765);
		addition(345678.5678,200,300);
		addition(100.8282,200,300);
}
}
