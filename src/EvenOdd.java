import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int su;
		su = input.nextInt();
		if (su % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다");
		}
		System.out.println("프로그램을 종료합니다");
	}
}
