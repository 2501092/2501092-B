import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        String time;
        int price = 10000;
        double discount = 0.0;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // 버퍼 비우기

        System.out.print("관람 시간을 입력하세요 (조조/일반): ");
        time = keyboard.nextLine();

        // 관람 시간에 따른 할인 (switch문 사용)
        switch (time) {
            case "조조":
                discount += 0.2;
                break;
            case "일반":
                discount += 0.0;
                break;
            default:
                System.out.println("잘못된 입력입니다. 조조 또는 일반만 입력하세요.");
                return; // 프로그램 종료
        }

        // 나이에 따른 할인 (if문 사용)
        if (age >= 8 && age <= 18) {
            discount += 0.3; // 청소년
        } else if (age >= 65) {
            discount += 0.4; // 경로자
        }

        int finalPrice = (int)(price * (1 - discount));

        System.out.println("\n=== 할인 결과 ===");
        System.out.println("기본 요금: " + price + "원");
        System.out.println("총 할인율: " + (int)(discount * 100) + "%");
        System.out.println("할인된 최종 요금: " + finalPrice + "원");
    }
}
