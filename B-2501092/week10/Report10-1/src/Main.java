import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] ip = new int[4];

        int nogood = 0;
        int totalVotes = 0;
        int xdata;

        System.out.println("--- 후보 번호(1~4) 입력을 시작합니다 ---");
        System.out.println("(투표 종료: 숫자가 아닌 문자(예: q)를 입력 후 엔터)");
        System.out.print("입력: ");

        while (keyboard.hasNextInt()) {

            xdata = keyboard.nextInt();

            totalVotes++;

            if (xdata >= 1 && xdata <= 4) {
                ip[xdata - 1]++;
            } else {
                nogood++;
            }

            System.out.print("입력: ");
        }

        System.out.println("\n--- 개표 결과 ---");

        for (int i = 0; i < ip.length; i++) {
            System.out.printf("%d번 : %d표\n", (i + 1), ip[i]);
        }

        System.out.printf("무효표 : %d표\n", nogood);
        System.out.printf("\n총 %d표\n", totalVotes);

        keyboard.close();
    }
}