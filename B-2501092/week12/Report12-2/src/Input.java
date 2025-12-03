import java.util.Scanner;

public class Input {
    private int year;

    public void readYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("판단할 연도를 입력하세요: ");
        this.year = scanner.nextInt();
    }

    public int getYear() {
        return year;
    }
}
