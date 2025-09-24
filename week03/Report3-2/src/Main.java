import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // '신입' 글자 삭제

        // import 구문 삭제

        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자 입력
        System.out.print("첫번째 숫자를 입력하세요 ");
        int num1 = scanner.nextInt();

        // 두 번째 숫자 입력
        System.out.print("두번째 숫자를 입력하세요 ");
        int num2 = scanner.nextInt();

        // 두 숫자의 합 계산
        int sum = num1 + num2;

        // 결과 출력
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // Scanner 닫기
        scanner.close();
    }
}