import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours ;
        String result;
        int salary;
        int extra;

        System.out.print("주당 근무 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours <= 40 ) {
            salary = 11500 * hours;
            extra = 0;
            result = String.format("급여는 %,d원 입니다.",salary);
        } else {
            salary = 11500 * 40;
            extra =  (int) (11500 * 1.5) * (hours - 40);
        }

        System.out.printf("%d 시간의 아르바이트 급여는 초과 수당 %d원와 급여 %d를 합한 %,d원 입니다..\n",hours,extra,salary,extra + salary);
    }
}