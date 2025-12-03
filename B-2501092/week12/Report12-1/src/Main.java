public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();


        input.readNumbers();
        int num1 = input.getNumber1();
        int num2 = input.getNumber2();

        int maxResult = compute.calculateMax(input);

        output.printResult(num1, num2, maxResult);
    }
}