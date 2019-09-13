package rit.calculator;

public abstract class BinaryOperator {

    private double arg1;
    private double arg2;

//    public BinaryOperator(double arg1, double arg2) {
//        this.arg1 = arg1;
//        this.arg2 = arg2;
//    }

    public abstract double apply(double arg1, double arg2);

}
