public class Main {
    public static void main(String[] args) {
         final int SPEED = 300000;
         float year = 365.25f;
         double light = 0.0;

         light = (((year * 24) * 60) *60) * SPEED;

        System.out.printf("빛이 1초에 가는 거리 : %,d km\n", SPEED);
        System.out.printf("1년 : %6.2f" , year);
        System.out.printf("1광년 : %,.2f km\n", light);
    }
}