public class Calculator {

    String history = "";
    public Calculator() {
    }

    public int add(int i, int i1) {
        int sum = i + i1;
        history += i + " + " + i1 + " = " + sum + "\n";
        return sum;
    }

    public int subtract(int i, int i1) {
        int difference = i - i1;
        history += i + " - " + i1 + " = " + difference + "\n";
        return difference;
    }

    public int divide(int i, int i1) {
        int quotient = i / i1;
        history += i + " / " + i1 + " = " + quotient + "\n";
        return quotient;
    }

    public int multiply(int i, int i1) {
        int product = i * i1;
        history += i + " * " + i1 + " = " + product + "\n";
        return i * i1;
    }

    public String getHistory() {
        return history;
    }
}
