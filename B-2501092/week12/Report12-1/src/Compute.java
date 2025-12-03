public class Compute {

    public int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public int calculateMax(Input input) {
        return max(input.getNumber1(), input.getNumber2());
    }
}