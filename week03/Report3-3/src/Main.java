import java.util.Scanner; // 키보드 입력을 위해 Scanner 클래스를 가져옵니다.

public class Main {
    public static void main(String[] args) {

        // try-with-resources 구문을 사용해 Scanner를 안전하게 관리합니다.
        try (Scanner scanner = new Scanner(System.in)) {

            // 1. 입력: 사용자에게 섭씨 온도를 입력받아 double 변수에 저장합니다.
            System.out.print("섭씨 온도(°C)를 입력해 주세요: ");
            double celsius = scanner.nextDouble();

            // 2. 변환 공식 적용: F = C * 9 / 5 + 32
            // (주의: 정수 나눗셈이 되지 않도록 9.0, 5.0과 같이 실수로 계산해야 합니다.)
            double fahrenheit = celsius * 9.0 / 5.0 + 32;

            // 3. 출력: 변환된 화씨 온도를 소수점 첫째 자리까지 깔끔하게 출력합니다.
            System.out.printf("입력하신 섭씨 %.1f°C는 화씨 %.1f°F입니다.\n", celsius, fahrenheit);

        } // try 블록이 끝나면 scanner.close()가 자동으로 호출됩니다.
    }
}