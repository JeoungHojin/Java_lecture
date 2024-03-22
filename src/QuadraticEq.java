import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float b;
		b = input.nextFloat();
		float c;
		c = input.nextFloat();
		
		double disc = b*b-4.0*c;
		double sqr = Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2.0;
		double r2 = (-b - sqr) / 2.0;
		
		System.out.println("근 : "+ r1);
		System.out.println("근 : "+ r2);
		

	}

}
