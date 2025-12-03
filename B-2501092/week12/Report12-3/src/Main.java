public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Compute compute = new Compute();
        Output output = new Output();

        input.readMoney();
        long money = input.getMoney();

        String hangulResult = compute.convertHangul(money);

        output.printResult(money, hangulResult);
    }
}