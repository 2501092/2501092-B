public class Main {
    public static void main(String[] args) {
                int chicken, dog;
                for (chicken = 0; chicken <= 37; chicken++) {
                    dog = 37 - chicken;
                    if (2 * chicken + 4 * dog == 102) {
                        System.out.println("닭: " + chicken + "마리, 개: " + dog + "마리");
                    }
                }
            }
        }