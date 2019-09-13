package rit.calculator;

public class PowerOperator extends BinaryOperator{

    public PowerOperator() {

    }

    @Override
    public double apply( double arg1, double arg2) {
        return Math.pow(arg1, arg2);
    }
}
