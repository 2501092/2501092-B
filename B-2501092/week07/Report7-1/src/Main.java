import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        int max = 0, mid = 0, min = 0;

        System.out.print("3개의 정수를 입력하세요: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 먼저 가장 큰 수(max) 구하기
        if (a >= b && a >= c)
            max = a;
        else if (b >= a && b >= c)
            max = b;
        else
            max = c;

        // 가장 작은 수(min) 구하기
        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else
            min = c;

        // 나머지 중간값(mid) 구하기
        switch (max) {
            case 0:
                break;
            default:
                if ((a != max) && (a != min))
                    mid = a;
                else if ((b != max) && (b != min))
                    mid = b;
                else
                    mid = c;
                break;
        }

        System.out.println("입력받은 " + a + ", " + b + ", " + c + "를 크기순으로 나열하면");
        System.out.println(min + ", " + mid + ", " + max + " 입니다.");
    }
}
