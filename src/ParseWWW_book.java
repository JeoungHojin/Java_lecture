import java.util.Scanner;

public class ParseWWW_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("문자열을 입력하세요>");
			str = sc.next();
			if (str.equals ("quit") == true) 
				break;
			
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str+"은 'www'로 시작합니다");
			}
			else {
				System.out.println(str+"은 www로 시작하지 않습니다");
			}		
		}
	}
}
