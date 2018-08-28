package day3;

public class NonStaticMeber {

	int num;
	
	NonStaticMeber(){
		System.out.println("Inside the constructor");
	}
	
	{
		System.out.println("Inside the nonstatic block");
	}
	
	public static void main(String[] args) {
System.out.println("Inside the main");
NonStaticMeber obj = new NonStaticMeber();
 obj.something();
	}
static {
	System.out.println("Inside the Static block");
}
void something(){
	System.out.println("Inside something");
}
}
