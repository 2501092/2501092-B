import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        String result;

        System.out.print("하나의 영문자 입력 : ");
        ch = keyboard.next().charAt(0);

        // 영문자 판별
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // 대문자인 경우
            if (ch >= 'A' && ch <= 'Z') {
                result = String.format("입력 문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.", ch, (char)(ch + 32));
            }
            // 소문자인 경우
            else {
                result = String.format("입력 문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.", ch, (char)(ch - 32));
            }
        } else {
            result = "영문자가 아닙니다.";
        }

        System.out.println(result);
        keyboard.close();
    }
}
