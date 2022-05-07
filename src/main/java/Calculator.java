public class Calculator {
    int sum(int... values) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        return sum;
    }

    long sum(long... values) {
        long sum = 0;
        for (long x : values) {
            sum += x;
        }
        return sum;
    }

    double sum(double... values) {
        double sum = 0;
        for (double x : values) {
            sum += x;
        }
        return sum;
    }

    float sum(float... values) {
        float sum = 0;
        for (float x : values) {
            sum += x;
        }
        return sum;
    }


    int subtraction(int a, int b) {
        int subtraction = a-b;
        return subtraction;
    }

    long subtraction(long a, long b) {
        long subtraction = a-b;
        return subtraction;
    }

    double subtraction(double a, double b) {
        double subtraction = a-b;
        return subtraction;
    }

    float subtraction(float a, float b) {
        float subtraction = a-b;
        return subtraction;
    }


    int multiply(int a, int b) {
        int multiply = a*b;
        return multiply;
    }

    long multiply(long a, long b) {
        long multiply = a*b;
        return multiply;
    }

    float multiply(float a, float b) {
        float multiply = a*b;
        return multiply;
    }

    double multiply(double a, double b) {
        double multiply = a*b;
        return multiply;
    }


    int division(int a, int b) {
        int division = a / b;
        return division;
    }

    long division(long a, long b) {
        long division = a / b;
        return division;
    }

    double division(double a, double b) {
        double division = a / b;
        return division;

    }

    float division(float a, float b) {
        float division = a / b;
        return division;
    }
}
