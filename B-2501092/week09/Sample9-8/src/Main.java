public class Main {
    public static void main(String[] args) {
        final int TURTLE = (35 * 1000) / (60 * 60); //초당 거리(속도)
        final int RABBIT = (60 * 1000) / (60 * 60); //초당 거리(속도)

        int turtle = 450;
        int rabbit = 0;

        int i = 1;
        for (; true; i++) {
            turtle += TURTLE;
            rabbit += RABBIT;

            if (rabbit > turtle)
                break;
            System.out.printf("%d초후 토끼 : %,d m,거북이 : %d m\n",i,rabbit,turtle);
        }
        System.out.printf("%d초후 토끼 : %,d m,거북이 : %d m\n",i,rabbit,turtle);
    }
}