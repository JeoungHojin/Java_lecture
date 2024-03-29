import java.util.Scanner;

public class ParseWWW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private String str;
		
		public String start_www() {
			return str + "\n은 'www'로 시작합니다";
		}
		
		public String not_www() {
			return str + "\n은 'www'로 시작하지 않습니다";
		}
		
		public Stirng input_str() {
			Scanner scan = new Scanner(System.in);
			System.out.println("문자열을 입력하세요 >");
			str = scan.nextLine();
		}
	}
}
