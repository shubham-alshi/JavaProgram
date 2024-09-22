package assignments_package;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the value of a");
			int a = sc.nextInt();
			System.out.println("enter the value of b");
			int b = sc.nextInt();
			System.out.println("summesion of a & b");
			int sum = (a+b);
			System.out.println(sum);
			/*
			System.out.println("area of circle is");
			double pi = 3.14;
			int r = 98;
			double circle_area = pi*r*r;
			System.out.println("circle_area");
			
			*/
		}
		
	}

}
