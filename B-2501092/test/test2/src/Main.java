import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double time; // 입력받을 시간(예: 3.76)
        int days, hours, minutes, seconds;

        System.out.print("시간 입력 : ");
        time = keyboard.nextDouble();

        // 일 계산 (24시간 기준)
        days = (int)(time / 24);
        time = time % 24;

        // 시 계산
        hours = (int)time;

        // 분 계산 (소수점 이하 부분만 가져와서 60 곱함)
        double temp = (time - hours) * 60;
        minutes = (int)temp;

        // 초 계산
        seconds = (int)((temp - minutes) * 60);

        // 결과 출력
        System.out.println();
        System.out.printf("%.2f 시간은 %d일 %d시간 %d분 %d초 입니다.%n",
                time + days * 24, days, hours, minutes, seconds);
    }
}