package assignments_package;

public class Assignment_2 {
	
    int a = 10;
    int b= 20;
    int c= 30;
    
    void addition() {
    	System.out.println(a+b+c);
    }
    void subtraction() {
    	System.out.println(a-b-c);
    }
    void multiplication() {
    	System.out.println(a*b*c);
    }
    void module() {
    	System.out.println(a%b%c);
    }
    void division() {
    	System.out.println(a/b/c);
    }
    

	public static void main(String[] args) {
		
		Assignment_2 a2 = new Assignment_2();
		a2.addition();
		a2.division();
		a2.module();
		a2.subtraction();
		a2.multiplication();
		
		
	}

}
