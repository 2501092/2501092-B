public class Compute {

    public int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    public int max4(int n1, int n2, int n3, int n4) {
        int maxAB = max(n1, n2);

        int maxCD = max(n3, n4);

        return max(maxAB, maxCD);
    }

    public int calculateMax4(Input input) {
        return max4(
                input.getNumber1(),
                input.getNumber2(),
                input.getNumber3(),
                input.getNumber4()
        );
    }
}