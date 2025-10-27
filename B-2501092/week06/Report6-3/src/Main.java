import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age, card, time;

        System.out.print("나이를 입력하세요: ");
        age = sc.nextInt();

        System.out.print("교통카드 사용 여부 (1:Y, 0:N): ");
        card = sc.nextInt();

        System.out.print("탑승 시각(0~23시)을 입력하세요: ");
        time = sc.nextInt();

        // 요금표 [카드/현금][성인,청소년,어린이]
        int[][] fareTable = {
                {1250, 750, 450}, // 교통카드
                {1350, 850, 450}  // 현금
        };

        // 나이에 따른 요금 구분 (성인=0, 청소년=1, 어린이=2)
        int ageType = (age >= 19) ? 0 : (age >= 13 ? 1 : 2);

        // 기본요금 선택
        int fare = fareTable[card == 1 ? 0 : 1][ageType];

        // 심야 요금 계산 (22~5시이면 1.2배)
        double multiplier = (time + 2) % 24 < 8 ? 1.2 : 1.0;

        // 총 요금 계산
        fare = (int)(fare * multiplier);

        System.out.printf("총 요금은 %d원입니다.\n", fare);
    }
}
