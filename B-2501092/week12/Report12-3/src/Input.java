import java.util.Scanner;

public class Input {
    private long money;

    public void readMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("16자리 이하의 금액을 입력하세요: ");
        this.money = scanner.nextLong();
    }

    public long getMoney() {
        return money;
    }
}
