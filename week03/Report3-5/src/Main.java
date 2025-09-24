public class Main {
    public static void main(String[] args) {
        // 데이터를 상수로 선언 (final 키워드 사용)
        final String SCHOOL = "경복대학교";
        final String NAME = "홍길동";
        final int AGE = 20;
        final char GENDER = '남'; // 대표 값 하나를 char로 저장
        final double HEIGHT = 170.6;
        final double WEIGHT = 65.4;

        System.out.println("********************");
        System.out.println("학교 : " + SCHOOL);
        System.out.println("이름 : " + NAME);
        System.out.println("나이 : " + AGE);
        System.out.println("성별 : " + GENDER);
        System.out.println("신장 : " + HEIGHT + " Cm");
        System.out.println("체중 : " + WEIGHT + " Kg");
        System.out.println("********************");
    }
}