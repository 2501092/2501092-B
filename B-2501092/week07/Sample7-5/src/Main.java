import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        int result;

        System.out.print("세 개의 정수를 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        // 삼항 연산자 사용
        result = (num1 >= num2)
                ? (num1 >= num3 ? num1 : num3)
                : (num2 >= num3 ? num2 : num3);

        System.out.printf("입력한 정수 %d, %d, %d 중 가장 큰 수는 %d 입니다.\n", num1, num2, num3, result);

        // if문 사용
        if (num1 >= num2 && num1 >= num3) {
            result = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            result = num2;
        } else {
            result = num3;
        }

        System.out.printf("입력한 정수 %d, %d, %d 중 가장 큰 수는 %d 입니다.\n", num1, num2, num3, result);

        keyboard.close();
    }
}