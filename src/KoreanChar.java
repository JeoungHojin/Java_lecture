
public class KoreanChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char korean;
		char[] ja = {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
		korean = '\uAC00';
		do {
			System.out.println(korean);
			korean++;
		} while (korean < '\uD7A4');
			
	}

}