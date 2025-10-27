import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                final int UNIT_PRICE = 56000; // 1평당 단가
                Scanner scanner = new Scanner(System.in);

                System.out.print("주택 면적(평)을 입력하세요: ");
                int area = scanner.nextInt();

                int totalPrice = area * UNIT_PRICE;

                int roundedPrice = (totalPrice / 1000) * 1000;

                System.out.printf("총 주택 가격은 %,d원 입니다.\n", roundedPrice);
            }
        }