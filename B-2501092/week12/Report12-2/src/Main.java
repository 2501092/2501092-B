public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();

        input.readYear();
        int year = input.getYear();

        boolean isLeap = compute.isLeapYearEven(year);

        output.printResult(year, isLeap);
    }
}