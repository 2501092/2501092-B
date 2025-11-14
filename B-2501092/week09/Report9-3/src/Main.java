public class Main {
    public static void main(String[] args) {
        int depth = 300;   // 우물 깊이 (cm)
        int up = 55;       // 낮 동안 올라가는 거리
        int down = 13;     // 밤 동안 미끄러지는 거리
        int height = 0;    // 현재 위치
        int day = 0;       // 경과 일수

        // 달팽이가 우물 밖으로 나올 때까지 반복
        while (height < depth) {
            day++;          // 하루 경과
            height += up;   // 낮 동안 올라감
            System.out.println(day + "일 낮: " + height + "cm");

            // 낮에 이미 탈출했으면 밤에 미끄러지지 않음 → 반복문 조건이 처리함
            if (height >= depth) break;

            height -= down; // 밤에 미끄러짐
            System.out.println(day + "일 밤: " + height + "cm");
        }

        System.out.println("달팽이는 " + day + "일째 낮에 우물을 탈출했습니다!");
    }
}