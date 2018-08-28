package day3;

public class ThisKeyord {
int x;
ThisKeyord(){
	System.out.println(this);
	System.out.println(this.x);
}
public static void main(String[] args) {
	new ThisKeyord();
	new ThisKeyord();
}
}
