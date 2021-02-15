package nz.co.deltics.udemy.javamasterclass;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() { return firstNumber; }
    public double getSecondNumber() { return secondNumber; }
    public void setFirstNumber(double value) { firstNumber = value; }
    public void setSecondNumber(double value) { secondNumber = value; }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber != 0) ? firstNumber / secondNumber : 0;
    }
}

