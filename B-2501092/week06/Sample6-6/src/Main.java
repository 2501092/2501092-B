import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int HEART = 60; //분당
        int life;
        long result;

        System.out.print("당신은 몇년 사셨나요 ?");
        life = keyboard.nextInt();

        result = (long) life * 365 * 24 * 60;

        System.out.printf("우리의 심장은 분당 %d회 박동합니다.\n",HEART);
        System.out.printf("%d년동안 우리의 심장은 %,d회 박동 합니다.\n",life,result);
    }
}