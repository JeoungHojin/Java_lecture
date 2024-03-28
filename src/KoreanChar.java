public class KoreanChar {

    public static void main(String[] args) {
        char korean = '\uAC00';

        do {
            System.out.println(korean);
            korean++;

            if (korean == '\uAE4C' || korean == '\uB098' || korean == '\uB2E4' || korean == '\uB300'|| korean == '\uB77C' || korean == '\uBA54' || korean == '\uB0A0' || korean == '\uB9E4'|| korean == '\uC0AC' || korean == '\uC2B8' || korean == '\uC544' || korean == '\uC790'|| korean == '\uC9DC' || korean == '\uCC28' || korean == '\uCE74' || korean == '\uD0C0'|| korean == '\uD30C' || korean == '\uD558') {
                System.out.println("--…--");
            }
        } while (korean <= '\uD7A3'); 
    }
}
