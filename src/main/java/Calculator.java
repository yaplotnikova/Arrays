public class Calculator {
    private int a;
    private int b;
    private char operation;

    public int calculate(String expression) {
        InputHelper inputHelper = new InputHelper(expression);
        a = inputHelper.getFirstNumber();
        b = inputHelper.getSecondNumber();
        operation = inputHelper.getOperation();
        if (operation == '+') {
            return a + b;
        } else if (operation == '-') {
            return a - b;
        } else if (operation == '*') {
            return a * b;
        } else if (operation == '/') {
            return a / b;
        } else {
            System.out.println("Такой операции не существует");
            return 0;
        }
    }
}