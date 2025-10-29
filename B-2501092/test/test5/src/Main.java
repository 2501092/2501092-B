import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final double PI = 3.141592; // π 값
        int r;                     // 반지름
        double volume;              // 부피
        double surfaceArea;         // 표면적

        System.out.print("구의 반지름을 입력하세요: ");
        r = keyboard.nextInt();

        // 구의 부피와 표면적 계산
        volume = (4.0 / 3.0) * PI * r * r * r;
        surfaceArea = 4 * PI * r * r;

        // 결과 출력
        System.out.printf("반지름: %d%n", r);
        System.out.printf("구의 부피: %.2f%n", volume);
        System.out.printf("구의 표면적: %.2f%n", surfaceArea);
    }
}
