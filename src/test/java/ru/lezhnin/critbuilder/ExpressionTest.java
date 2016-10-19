package ru.lezhnin.critbuilder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertTrue;

public class ExpressionTest {
    @Test
    public void testExpressions() throws Exception {
        ExpressionEQ<String, String> stringExpressionEQ = new ExpressionEQ<>(
                new ParameterHolder<>("test", "test"),
                new ValueHolder<>("test")
        );
        assertTrue(stringExpressionEQ.call());
        ExpressionNE<String, String> stringExpressionNE = new ExpressionNE<>(
                new ParameterHolder<>("test", "not test"),
                new ValueHolder<>("test")
        );
        assertTrue(stringExpressionNE.call());
        ExpressionStringIsEmpty expressionStringIsEmpty = new ExpressionStringIsEmpty(new ValueHolder<>("test"));
        assertTrue(new OperationNOT(expressionStringIsEmpty).call());
        assertTrue(new OperationAND(stringExpressionEQ, stringExpressionNE).call());
        assertTrue(new OperationOR(stringExpressionEQ, expressionStringIsEmpty).call());
        ValueHolder<Integer> int1 = new ValueHolder<>(1);
        ValueHolder<Integer> int2 = new ValueHolder<>(2);
        assertTrue(new ExpressionGE<>(int2, int1).call());
        assertTrue(new ExpressionGE<>(int1, int1).call());
        assertTrue(new ExpressionGT<>(int2, int1).call());
        assertTrue(new ExpressionLE<>(int1, int2).call());
        assertTrue(new ExpressionLE<>(int1, int1).call());
        assertTrue(new ExpressionLT<>(int1, int2).call());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEmptyParameter() throws Exception {
        thrown.expect(EmptyParameterError.class);
        thrown.expectMessage(containsString("test"));
        assertTrue(new ExpressionEQ<>(new ParameterHolder<>("test"), new ValueHolder<>("test")).call());
    }
}
