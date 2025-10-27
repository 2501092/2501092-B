import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        String result;
        double s;
        double area;
        boolean flag = false;

        System.out.print("삼각형의 세 변의 길이 (정수) 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            s = (a + b + c) / 2.0; // 반둘레
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 헤론의 공식
            result = String.format("면적 : %.2f ㎠", area);
        } else {
            result = "삼각형을 만들 수 없습니다.";
            flag = false;
        }
if (flag) {
    System.out.printf("삼각형의 각 변의 길이가 %dcm, %dcm, %dcm이면, %s\n", a, b, c, result);
} else {
    System.err.printf("삼각형의 각 변의 길이가 %dcm, %dcm, %dcm이면, %s\n", a, b, c, result);
}
    }
}
