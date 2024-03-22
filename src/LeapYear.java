import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year ;
		year = input.nextInt();
		boolean isLeapYear;
		
		isLeapYear = (year % 4 == 0);
		System.out.println(isLeapYear);
	}
}
