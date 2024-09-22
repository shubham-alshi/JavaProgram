package assignments_package;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double radius = sc.nextDouble();
		System.out.println("area of circle is");
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println(area);
	}

}
