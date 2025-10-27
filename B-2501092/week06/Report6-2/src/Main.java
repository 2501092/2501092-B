import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("주유할 리터 수: ");
                double liter = sc.nextDouble();

                System.out.print("리터당 가격: ");
                double price = sc.nextDouble();

                double total = liter * price;
                if (total >= 50000) total *= 0.93;   // 7% 할인 적용 (100% - 7% = 93%)

                total *= 1.10;  // 부가세 10% 추가

                System.out.println("최종 결제 금액: " + (int)total + "원");
                sc.close();
            }
        }
