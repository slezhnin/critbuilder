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
        assertTrue(new OperationNot(expressionStringIsEmpty).call());
        assertTrue(new OperationAnd(stringExpressionEQ, stringExpressionNE).call());
        assertTrue(new OperationOr(stringExpressionEQ, expressionStringIsEmpty).call());
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
