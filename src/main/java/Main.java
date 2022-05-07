public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("This is calculator! ");
        System.out.println(calculator.sum(2,5,6,71));
        System.out.println(calculator.sum(2.1,3.5,5.0));
        System.out.println(calculator.sum(214748364925L,214748364914L,2147481523649L));
        System.out.println(calculator.sum(30.6f, 15.235414f, 2.035f));
        System.out.println(calculator.subtraction(10250,45136));
        System.out.println(calculator.subtraction(2147481523649L, 54635347272636L));
        System.out.println(calculator.subtraction(2.56, 2.36));
        System.out.println(calculator.subtraction(17.25635,12.47851));
        System.out.println(calculator.multiply(2,9));
        System.out.println(calculator.multiply(214748364925L, 214748364925L));
        System.out.println(calculator.multiply(3.14, 2.55));
        System.out.println(calculator.multiply(15.235414, 7.123456789));
        System.out.println(calculator.division(36,6));
        System.out.println(calculator.division(214748364925L, 214748364925L));
        System.out.println(calculator.division(12.568329, 3.4578213));
        System.out.println(calculator.division(15.55,3.33));
        System.out.println("This is the end!");

    }
}
