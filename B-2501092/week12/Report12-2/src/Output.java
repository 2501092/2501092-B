public class Output {

    public void printResult(int year, boolean isLeap) {
        String result = isLeap ? "윤년" : "평년";

        System.out.println("--- 윤년 판별 결과 ---");
        System.out.println("입력된 연도: " + year + "년");
        System.out.println("판단 결과: " + year + "년은 " + result + "입니다.");
    }
}