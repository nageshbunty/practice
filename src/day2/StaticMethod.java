package day2;

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticMethod.method1();
		
	}
	static void method1(){
	 System.out.println("Inside method1");
 }
	static{
		System.out.println("Inside the static block");
		StaticMethod.method1();
	}
}
