import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        int result;

        System.out.print("정수 입력 (1~10000) : ");
        num = keyboard.nextInt(10);

        if(!(num >= 1 && num <= 10000)) {
            System.err.print("ERROR : 입력 범위는 1~9999 입니다.\n");
        } else {
            if (num >= 1000) {
                result = 9999 - num + 1;
            } else if (num >= 100) {
                result = 999 - num + 1;
            } else if (num >= 10) {
                result = 99 - num + 1;
            } else {
                result = 9 - num + 1;
            }
            System.out.printf("입력한 정수 %,d의 10의 보수는 %,d 입니다.\n",num,result);
        }


        }
        }
