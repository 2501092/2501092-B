public class Main {
    public static void main(String[] args) {
        int[] data = new int[10];
        int result;

        Input.readData(data);        // call by reference
        result = Compute.add(data);   // call by reference
        Output.display(data, result);  // 혼합 형태

    }
}