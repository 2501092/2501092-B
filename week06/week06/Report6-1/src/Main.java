import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PRICE = 5000;

        System.out.print("식권 개수를 입력하세요: ");
        int count = sc.nextInt();

        double discountRate = (count >= 30) ? 0.20 :
                (count >= 20) ? 0.15 :
                        (count >= 10) ? 0.10 : 0.0;

        double total = count * PRICE;
        double finalPrice = total * (1 - discountRate);

        System.out.println("구매 개수: " + count + "장");
        System.out.println("할인율: " + (discountRate * 100) + "%");
        System.out.println("결제 금액: " + (int)finalPrice + "원");

        sc.close();
    }
}
