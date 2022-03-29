package com.android.s19110317;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class CalculatorTest {
    private Calculator mCalculator;
    private double delta = .0001d;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void add() {
        double result =  mCalculator.add(1d, 2d);
        assertEquals(result, 3d, delta);
    }

    @Test
    public void sub() {
        double result =  mCalculator.sub(1d, 2d);
        assertEquals(result, -1d, delta);
    }

    @Test
    public void div() {
        double result =  mCalculator.div(1d, 2d);
        assertEquals(result, .5d, delta);
    }

    @Test
    public void mul() {
        double result =  mCalculator.mul(1d, 2d);
        assertEquals(result, 2d, delta);
    }

    @Test
    public void pow() {
        double result =  mCalculator.pow(1d, 2d);
        assertEquals(result, 1d, delta);
    }

    @Test
    public void fac() {
        double result =  mCalculator.fac(1d);
        assertEquals(result, 1d, delta);
    }

    @Test
    public void log() {
        double result =  mCalculator.log(1d, 2d);
        assertEquals(result, 0d, delta);
    }
}