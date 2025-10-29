import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                int age;
                int fee; // 입장료 저장 변수

                System.out.print("나이를 입력하세요: ");
                age = keyboard.nextInt();

                // 조건 연산자(삼항 연산자)를 이용한 요금 계산
                fee = (age >= 18) ? 4000 :
                        (age >= 13) ? 3000 :
                                (age >= 7)  ? 1000 : 0;

                // 출력
                System.out.println("나이: " + age + "세");
                System.out.println("입장료: " + (fee == 0 ? "무료" : fee + "원"));
            }
        }