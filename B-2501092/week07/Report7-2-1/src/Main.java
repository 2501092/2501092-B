import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp;

        System.out.print("현재 온도를 입력하세요: ");
        temp = keyboard.nextInt();

        if (temp >= 35) {
            System.out.println("폭염경보");
        } else if (temp >= 30 && temp < 35) {
            System.out.println("폭염주의보");
        } else if (temp >= -10 && temp < 30) {
            System.out.println("정상온도");
        } else { // temp < -10
            System.out.println("한파경보");
        }
    }
}
