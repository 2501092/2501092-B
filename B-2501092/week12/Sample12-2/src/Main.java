public class Main {
    public static void main(String[] args) {
        double temp;
        double result;

        temp = Input.readData();           // call by name
        result = Compute.convert(temp);    // call by value
        Output.display(temp, result);      // call by value
    }
}