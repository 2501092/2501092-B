import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = sc.nextInt();

        // 정사각형의 한 변 길이
        int side = radius * 2;

        // 면적 계산
        double squareArea = side * side;
        double circleArea = radius * radius * Math.PI;
        double resultArea = squareArea - circleArea;

        // 출력
        System.out.println("정사각형 면적 : " + squareArea + " Cm2");
        System.out.printf("원의 면적 : %.2f Cm2%n", circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2%n", resultArea);
    }
}