import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor, eng, math;
        double avg;
        String result = "";

        System.out.print("국어, 영어, 수학 점수는 ? ");
        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        avg = (kor + eng + math) / 3.0;

        // 평균 점수를 10으로 나눠 구간화
        switch ((int) avg / 10) {
            case 10:
            case 9:
            case 8:
                result = "성적양호";
                break;
            case 7:
            case 6:
                result = "노력";
                break;
            default:
                result = "성적불량";
        }

        System.out.println("====================================");
        System.out.println("국어\t영어\t수학\t평균\t결과");
        System.out.printf("%d\t%d\t%d\t%.2f\t%s\n", kor, eng, math, avg, result);
        System.out.println("====================================");
    }
}