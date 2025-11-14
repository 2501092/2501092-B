import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
        int total = 0;
        float avg;

        int[] java = new int[name.length];
        int i = 0;

        while (true) {
            System.out.printf("%s님의 JAVA 성적 입력 : ", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100)
                i++;
            else {
                System.err.println("ERROR : 0 ~ 100 사이");
                System.in.read();
            }

            if (i >= name.length)
                break;
        }

        for (i = 0; i < java.length; i++)
            total += java[i];

        avg = (float) total / java.length;

        for (i = 0; i < java.length; i++)
            System.out.printf("%s 학생 = %3d 점\n", name[i], java[i]);

        System.out.printf("총점 : %3d 점\n", total);
        System.out.printf("평균 : %.2f 점\n", avg);
    }
}
