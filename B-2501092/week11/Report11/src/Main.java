import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String[][] users = {{"1111", "홍길동", ""}, {"2222", "이수도", ""}, {"3333", "한민국", ""}, {"1212", "이으뜸", ""},
                {"1313", "나이쁨", ""}, {"4444", "김도령", ""}, {"2121", "박대령", ""}, {"4343", "허달수", ""},
                {"6789", "장마당", ""}, {"4545", "정성길", ""}};

        int[] codes = {1, 2, 2, 3, 4, 4, 1, 1, 4, 3};
        double[] rawUsages = {700.1, 56.7, 785.6, 345.7, 321.4, 789.6, 456.7, 678.4, 56.7, 895.6};
        long[][] bills = new long[10][4];
        int count = users.length;

        for (int i = 0; i < count; i++) {
            bills[i][0] = Math.round(rawUsages[i]);
        }

        for (int i = 0; i < count; i++) {
            switch (codes[i]) {
                case 1:
                    users[i][2] = "가정용";
                    bills[i][1] = bills[i][0] * 40;
                    break;
                case 2:
                    users[i][2] = "영업용";
                    bills[i][1] = bills[i][0] * 55;
                    break;
                case 3:
                    users[i][2] = "공장용";
                    bills[i][1] = bills[i][0] * 78;
                    break;
                case 4:
                    users[i][2] = "관공서";
                    bills[i][1] = bills[i][0] * 35;
                    break;
                case 5:
                    users[i][2] = "군기관";
                    bills[i][1] = bills[i][0] * 20;
                    break;
                default:
                    users[i][2] = "미확인";
                    bills[i][1] = 0;
            }
        }

        for (int i = 0; i < count; i++) {
            double taxRate = 0.0;
            if (codes[i] == 1) taxRate = 0.05;
            else if (codes[i] == 2) taxRate = 0.035;
            else if (codes[i] == 3) taxRate = 0.025;
            else if (codes[i] == 4) taxRate = 0.015;

            bills[i][2] = (long)((1200 + bills[i][1]) * taxRate);
            bills[i][2] = (bills[i][2] / 10) * 10;
        }

        for (int i = 0; i < count; i++) {
            bills[i][3] = 1200 + bills[i][1] + bills[i][2];
        }

        System.out.println("*******************************************************************");
        System.out.println(" 번호   이름    구분    사용량   사용금액    TAX    납부액    비고 ");
        System.out.println("*******************************************************************");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-6s %-6s %-6s %6.1f %9d %7d %9d\n",
                    users[i][0], users[i][1], users[i][2],
                    rawUsages[i], bills[i][1], bills[i][2], bills[i][3]);
        }
        System.out.println("*******************************************************************");
    }
}