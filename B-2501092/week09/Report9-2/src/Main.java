public class Main {
    public static void main(String[] args) {
        int coin500 = 10;  // 500원짜리 동전 개수
        int coin100 = 10;  // 100원짜리 동전 개수
        int value500 = 500;
        int value100 = 100;

        int month = (value500 * coin500) + (value100 * coin100); // 한 달 저금액
        int total = 0; // 총 저금액

        // 30년 동안 매달 저금
        for (int year = 1; year <= 30; year++) {
            for (int m = 1; m <= 12; m++) {
                total += month;
            }

            // 10, 20, 30년 단위로만 출력 (반복문 이용)
            for (int check = year; check <= 30; check += 10) {
                if (check == year && (year % 10 == 0)) {
                    System.out.println(year + "년차 저금액: " + total + "원");
                }
            }
        }
    }
}