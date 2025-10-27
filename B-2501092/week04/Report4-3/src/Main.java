import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dollar, half, quarter, dime, nickel, penny;

        System.out.print("Dollar 개수는? ");
        dollar = sc.nextInt();

        System.out.print("Half Dollar 개수는? ");
        half = sc.nextInt();

        System.out.print("Quarter 개수는? ");
        quarter = sc.nextInt();

        System.out.print("Dime 개수는? ");
        dime = sc.nextInt();

        System.out.print("Nickel 개수는? ");
        nickel = sc.nextInt();

        System.out.print("Penny 개수는? ");
        penny = sc.nextInt();

        // 총 센트 계산
        int totalCents = dollar * 100
                + half * 50
                + quarter * 25
                + dime * 10
                + nickel * 5
                + penny * 1;

        // 달러와 센트로 변환
        int totalDollars = totalCents / 100;
        int remainCents = totalCents % 100;

        System.out.printf("\n총 금액: %d 센트", totalCents);
        System.out.printf("\n총 금액: %d 달러 %d 센트\n", totalDollars, remainCents);

        sc.close();
    }
}
