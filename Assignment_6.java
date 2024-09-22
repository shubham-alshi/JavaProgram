package assignments_package;

import java.util.Scanner;

public class Assignment_6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double rad = sc.nextDouble();
		System.out.println("circumference of circle");
		double circumference = 2 * Math.PI * rad;
		System.out.println(circumference);
		
		
	}

}
