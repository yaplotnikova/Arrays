public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate("2 + 2");
        System.out.println(result);
        StringSum sum = new StringSum("2 2 4");
        StringSum sum1 = new StringSum("2qwe2%^&4");
        StringSum sum2 = new StringSum("qwerty");
    }
}
