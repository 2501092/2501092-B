public class Main {
    public static void main(String[] args) {

        for (int j = 1; j <= 3; j++) {
            System.out.printf("Set : %d\n", j);
            int i = 1;

            do {
                System.out.printf("팔굽혀펴기 : %2d회\n", i++);
            } while (i <= 20);

            // while문 예시
            while (i <= 20) {
                System.out.printf("팔굽혀펴기 : %2d회\n", i++);
            }

            /*
            for (int i = 1; i <= 20; i++) {
                System.out.printf("팔굽혀펴기 : %2d회\n", i);
            }
            */
        }
    }
}