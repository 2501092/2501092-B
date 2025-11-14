import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[10];

        int total = 0;
        float average = 0.0f;
        int max;
        int min;

        System.out.println("10개의 정수 데이터 입력 (0~100)");

        int i = 0;
        while (i < score.length) {
            System.out.printf("%d : ", (i + 1));

            int inputScore = keyboard.nextInt();

            if (inputScore >= 0 && inputScore <= 100) {
                score[i] = inputScore;
                i++;
            } else {
                System.out.println("ERROR: 0부터 100 사이의 점수를 입력하세요.");
            }
        }

        total = score[0];
        max = score[0];
        min = score[0];

        for (i = 1; i < score.length; i++) {
            total = total + score[i];

            if (score[i] > max) {
                max = score[i];
            }

            if (score[i] < min) {
                min = score[i];
            }
        }

        average = (float) total / score.length;

        System.out.println("\n--- 출력 결과 ---");
        System.out.println("합계 : " + total);
        System.out.printf("평균 : %.2f\n", average);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

        keyboard.close();
    }
}