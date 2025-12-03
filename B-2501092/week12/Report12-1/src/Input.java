import java.util.Scanner; // ⬅️ import 문은 클래스 정의 밖에 위치

public class Input { // ⬅️ 하나의 Input 클래스만 정의
    private int number1;
    private int number2;

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        this.number1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        this.number2 = scanner.nextInt();
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
