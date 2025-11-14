import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
        float[] weight = new float[name.length];
        final float MIN = 30.0f;
        final float MAX = 120.0f;

        int i = 0;
        while (i < weight.length) {
            System.out.printf("%s님의 몸무게 입력 : ", name[i]);
            weight[i] = keyboard.nextFloat();

            if (weight[i] >= MIN && weight[i] <= MAX)
                i++;
            else {
                System.out.printf("ERROR : %.1f ~ %.1f\n", MIN, MAX);
                System.in.read();
            }
        }

        boolean swapped;
        do {
            swapped = false;
            for (i = 0; i < weight.length - 1; i++) {
                if (weight[i] > weight[i + 1]) {

                    float temp = weight[i];
                    weight[i] = weight[i + 1];
                    weight[i + 1] = temp;

                    String text = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = text;

                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("\n몸무게 오름차순 정렬 결과");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%s님의 몸무게 : %5.1f Kg\n", name[i], weight[i]);
        }
    }
}
