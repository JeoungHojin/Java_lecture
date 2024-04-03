import java.util.Scanner;

public class ParseWWW {
		//main은 하나만 있어도 된다~
		private String str;
		private String start_3;
	
	public ParseWWW() {
		
	}
	
	public String start_www(String str) {
		return str + "\n"+str+"은 'www'로 시작합니다";
	}
		
	public String not_www(String str) {
		return str + "\n"+str+"은 'www'로 시작하지 않습니다";
	}
	
	public void input() {
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