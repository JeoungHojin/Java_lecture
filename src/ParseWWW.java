import java.util.Scanner;

public class ParseWWW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String str;
		private String start_3;
	}
	public ParseWWW(String s, String s3) {
		str = s;
		start_3 = s3;
	}
	
	public String start_www(String str) {
		return str + "\n"+str+"은 'www'로 시작합니다";
	}
		
	public String not_www(String str) {
		return str + "\n"+str+"은 'www'로 시작하지 않습니다";
	}
	
	public void input(String str, String start_3) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요 >");
			str = scan.nextLine();
			if(str.equals ("quit") == true) {
				break;
			}
			
			start_3 = str.substring(0,3);
			
			if(start_3.equals("www")) {
				System.out.println(start_www(str));
			}
			else {
				System.out.println(not_www(str));
			}
		}
	}
}
