package assignments_package;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter radius of circle");
		 double rad = sc.nextDouble();
		 System.out.println("area of circle is");
		 double area = Math.PI * rad * rad;
		 System.out.println(area);
	}
	 
	}

}
