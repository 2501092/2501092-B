import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int kor, eng, math;
        int total;
        float avg;
        String result;

        System.out.print("당신의 이름 입력 : ");
        name = keyboard.nextLine();

        while (true) {
            System.out.print("국어 성적 입력 : ");
            kor = keyboard.nextInt();
            System.out.print("영어 성적 입력 : ");
            eng = keyboard.nextInt();
            System.out.print("수학 성적 입력 : ");
            math = keyboard.nextInt();

            if ((kor >= 0 && kor <= 100) &&
                    (eng >= 0 && eng <= 100) &&
                    (math >= 0 && math <= 100)) {
                break;
            } else {
                System.err.println("ERROR : 점수는 0점 ~ 100점 사이여야 합니다.");
                System.out.println("계속하려면 Enter 키를 누르세요...");
                System.in.read();  // 대기
                System.in.read();  // 남은 엔터 제거
            }
        }

        total = kor + eng + math;
        avg = total / 3.0f; // ✅ 오타 수정 (tatal → total)

        if (avg >= 70.0f) {
            result = "합격";
        } else {
            result = "불합격";
        }

        // ✅ 출력부
        System.out.printf("%s님의 성적\n", name);
        System.out.printf("\t국어 : %d 점\n", kor);
        System.out.printf("\t영어 : %d 점\n", eng);
        System.out.printf("\t수학 : %d 점\n", math);
        System.out.printf("\t합계 : %d 점\n", total);
        System.out.printf("\t평균 : %.2f 점\n", avg);
        System.out.printf("\t판정 : %s\n", result);
    }
}
