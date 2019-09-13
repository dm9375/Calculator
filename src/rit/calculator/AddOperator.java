package rit.calculator;

public class AddOperator extends BinaryOperator{

    public AddOperator() {

    }

    @Override
    public double apply(double arg1, double arg2) {
        return arg1 + arg2;
    }
}
