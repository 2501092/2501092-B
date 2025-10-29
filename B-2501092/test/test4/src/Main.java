import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double buyPrice;   // 매입가
        double profitRate; // 이익률
        double taxRate = 0.1; // 세율 10%
        double salePrice;  // 정가 (판매가)
        double saleTax;    // 매출세액
        double buyTax;     // 매입세액
        double payTax;     // 납부세액

        System.out.print("매입가를 입력하세요: ");
        buyPrice = keyboard.nextDouble();

        System.out.print("이익률(%)을 입력하세요: ");
        profitRate = keyboard.nextDouble();

        // 정가 계산
        salePrice = buyPrice * (1 + profitRate / 100);

        // 세액 계산
        saleTax = salePrice * taxRate;
        buyTax = buyPrice * taxRate;

        // 납부 세액 계산
        payTax = saleTax - buyTax;

        // 결과 출력
        System.out.printf("정가(판매가): %.0f원%n", salePrice);
        System.out.printf("매출 세액: %.0f원%n", saleTax);
        System.out.printf("매입 세액: %.0f원%n", buyTax);
        System.out.printf("납부 세액: %.0f원%n", payTax);
    }
}
