public class Main {
    public static void main(String[] args) {
        // 주문자: '홍길동'은 문자열이므로 String 타입을 사용합니다.
        String name = "홍길동";

        // 모니터(cm): 60.96은 소수점이 있는 숫자이므로 double 타입을 사용합니다.
        double moni = 60.96;

        // CPU클럭(GHz): 2.8은 소수점이 있는 숫자이므로 double 타입을 사용합니다.
        double clk = 2.8;

        // 하드디스크(GB): 500은 정수이므로 int 타입을 사용합니다.
        int hdd = 500;

        // 기타: '방문설치'는 문자열이므로 String 타입을 사용합니다.
        String etc = "방문설치";

        // 선언된 변수 출력 예시
        System.out.println("주문자: " + name);
        System.out.println("모니터 크기(cm): " + moni);
        System.out.println("CPU 클럭(GHz): " + clk);
        System.out.println("하드디스크 용량(GB): " + hdd);
        System.out.println("기타 사항: " + etc);
    }
}