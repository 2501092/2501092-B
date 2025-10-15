import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int MPS = 340; // meter
        float fighter;
        float temp;
        int result;

        System.out.print("전투기에 스피드 입력 : ");
        fighter = keyboard.nextFloat();

        temp = fighter * 365 * 24 * 60 * 60 * MPS;
        result = (int) (temp / 1000);

        System.out.printf("마하 %.1f인 전투기에 1년간 간 거리는 %,d Km 입니다.\n",fighter,result);

    }
}