import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("판매금액을 입력하세요: ");
        int total = sc.nextInt();

        int tax = total / 11;
        int amount = total - tax;

        // 결과
        System.out.println("판매금액: " + total + "원");
        System.out.println("금액: " + amount + "원");
        System.out.println("세금: " + tax + "원");

        sc.close();
    }
}