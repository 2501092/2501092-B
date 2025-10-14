import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price;           // 구매 금액
        boolean isMember;    // 멤버십 여부

        System.out.print("구매 금액을 입력하세요: ");
        price = input.nextInt();

        System.out.print("멤버십 회원인가요? (true 또는 false 입력): ");
        isMember = input.nextBoolean();

        // 무료배송 조건
        if (price >= 50000 || (isMember && price >= 30000)) {
            System.out.println("무료배송 가능합니다!");
        } else {
            System.out.println("무료배송 불가능합니다.");
        }

        input.close();
    }
}
