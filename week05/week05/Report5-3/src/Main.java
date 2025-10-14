public class Main {
            public static void main(String[] args) {
                int totalSeconds = 54321; // 전체 초
                int hours, minutes, seconds;

                // 1시간 = 3600초
                hours = totalSeconds / 3600;
                totalSeconds = totalSeconds % 3600;

                // 1분 = 60초
                minutes = totalSeconds / 60;
                seconds = totalSeconds % 60;

                // 결과 출력
                System.out.println("54321초 = " + hours + "시간 " + minutes + "분 " + seconds + "초");
            }
        }