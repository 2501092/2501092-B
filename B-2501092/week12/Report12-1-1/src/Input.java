import java.util.Scanner;

public class Input {
    private int number1;
    private int number2;
    private int number3;
    private int number4;

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        this.number1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        this.number2 = scanner.nextInt();
        System.out.print("세 번째 정수를 입력하세요: ");
        this.number3 = scanner.nextInt();
        System.out.print("네 번째 정수를 입력하세요: ");
        this.number4 = scanner.nextInt();
    }

    public int getNumber1() { return number1; }
    public int getNumber2() { return number2; }
    public int getNumber3() { return number3; }
    public int getNumber4() { return number4; }
}