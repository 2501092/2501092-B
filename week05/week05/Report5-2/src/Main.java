import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = input.nextInt();

        String grade;

        switch (score / 5) {
            case 20: // 100점
            case 19: // 95~99
                grade = "A+";
                break;
            case 18: // 90~94
                grade = "A0";
                break;
            case 17: // 85~89
                grade = "B+";
                break;
            case 16: // 80~84
                grade = "B0";
                break;
            case 15: // 75~79
                grade = "C+";
                break;
            case 14: // 70~74
                grade = "C0";
                break;
            case 13: // 65~69
                grade = "D+";
                break;
            case 12: // 60~64
                grade = "D0";
                break;
            default: // 59 이하
                grade = "F";
        }

        System.out.println("입력 점수 : " + score);
        System.out.println("학점 : " + grade);
        input.close();
    }
}
