package FirstW;

public class Main {
    public static void main(String[] args) {
        CalculatorImpl calculator = new CalculatorImpl();
        int res ;
        res = calculator.calc(5);
        System.out.println(res);
    }
}
