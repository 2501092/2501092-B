import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이, 체중, 신장을 빈칸으로 구분하여 입력하세요:");
        int age = sc.nextInt();
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        System.out.println("당신의 체중은 " + weight + "kg 입니다.");
        System.out.println("당신의 신장은 " + height + "cm 입니다.");
    }
}