package ru.lezhnin.critbuilder;

class ExpressionNE<L, R> extends ExpressionEQ<L, R> {

    public ExpressionNE(Value<L> left, Value<R> right) {
        super(left, right);
    }

    @Override
    public Boolean call() throws Exception {
        return !super.call();
    }
}
