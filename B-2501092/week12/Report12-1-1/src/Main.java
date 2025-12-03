public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();

        input.readNumbers();
        int num1 = input.getNumber1();
        int num2 = input.getNumber2();
        int num3 = input.getNumber3();
        int num4 = input.getNumber4();

        int maxResult = compute.calculateMax4(input);

        output.printResult4(num1, num2, num3, num4, maxResult);
    }
}