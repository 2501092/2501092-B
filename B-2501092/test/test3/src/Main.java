import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double totalExpense; // 총지출액
        double saving;       // 저축액
        double foodExpense;  // 식생활비
        double engelIndex;   // 엥겔지수

        System.out.print("총지출액을 입력하세요: ");
        totalExpense = keyboard.nextDouble();

        System.out.print("저축액을 입력하세요: ");
        saving = keyboard.nextDouble();

        // 식생활비 계산
        foodExpense = totalExpense - saving;

        // 엥겔지수 계산
        engelIndex = (foodExpense / totalExpense) * 100;

        // 엥겔지수 결과 출력
        System.out.println("\n엥겔지수 계산 결과");
        System.out.printf("총지출액: %.0f원\n", totalExpense);
        System.out.printf("저축액: %.0f원\n", saving);
        System.out.printf("식생활비: %.0f원\n", foodExpense);
        System.out.printf("엥겔지수: %.2f%%\n", engelIndex);

        // 계층 판정
        if (engelIndex <= 30) {
            System.out.println("계층 판정: 상류층");
        } else if (engelIndex <= 50) {
            System.out.println("계층 판정: 중산층");
        } else {
            System.out.println("계층 판정: 하류층");
        }
    }
}