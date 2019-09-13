package rit.calculator;

public class BinaryOperation {

    private double arg1;
    private double arg2;
    private BinaryOperator aOperation;

    public BinaryOperation(BinaryOperator aOperation, double arg1, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.aOperation = aOperation;
    }

    public double getResult() {
        return aOperation.apply(arg1, arg2);
    }
}
