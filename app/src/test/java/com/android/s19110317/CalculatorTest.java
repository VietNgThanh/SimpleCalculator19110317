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
    private double delta = .001d;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(mCalculator.add(1d, 2d), 3d, delta);
        assertEquals(mCalculator.add(-1d, 2d), 1d, delta);
        assertEquals(mCalculator.add(4000000d, -8000000d), -4000000d, delta);
        assertEquals(mCalculator.add(-1523.1823d, -1278631.92384d), -1280155.106d, delta);
        assertEquals(mCalculator.add(-9.6d, 9.789d), .189d, delta);
        assertEquals(mCalculator.add(Double.MAX_VALUE, -Double.MAX_VALUE), 0d, delta);
        assertEquals(mCalculator.add(999999999999d, 999999999999.999999999d), 1999999999998.999999999d, delta);
        assertEquals(mCalculator.add(-999999999999d, -999999999999.999999999d), -1999999999998.999999999d, delta);
    }

    @Test
    public void sub() {
        assertEquals(mCalculator.sub(1d, 2d), -1d, delta);
        assertEquals(mCalculator.sub(-1d, 2d), -3d, delta);
        assertEquals(mCalculator.sub(4000000d, -8000000d), 12000000d, delta);
        assertEquals(mCalculator.sub(-1523.1823d, -1278631.92384d), 1277108.742d, delta);
        assertEquals(mCalculator.sub(-9.6d, 9.789d), -19.389d, delta);
        assertEquals(mCalculator.sub(999999999999d, -999999999999.999999999d), 1999999999998.999999999d, delta);
        assertEquals(mCalculator.sub(999999999999d, 999999999999.999999999d), -0.999999999d, delta);
        assertEquals(mCalculator.sub(-999999999999d, -999999999999.999999999d), 0.999999999d, delta);
    }

    @Test
    public void div() {
        assertEquals(mCalculator.div(1d, 2d), 0.5d, delta);
        assertEquals(mCalculator.div(1d, 0d), Double.POSITIVE_INFINITY, delta);
        assertEquals(mCalculator.div(-1d, 0d), Double.NEGATIVE_INFINITY, delta);
        assertEquals(mCalculator.div(0d, 0d), Double.NaN, delta);
        assertEquals(mCalculator.div(69.6428d, -1389.157d), -.0501331383d, delta);
        assertEquals(mCalculator.div(999999999999d, 999999999999d), 1d, delta);
        assertEquals(mCalculator.div(-999999999999d, -999999999999d), 1d, delta);
        assertEquals(mCalculator.div(0d, 9999999999999999d), 0d, delta);
        assertEquals(mCalculator.div(0d, -9999999999999999d), 0d, delta);
    }

    @Test
    public void mul() {
        assertEquals(mCalculator.mul(1d, 2d), 2d, delta);
        assertEquals(mCalculator.mul(1d, 0d), 0d, delta);
        assertEquals(mCalculator.mul(-1d, 0d), 0d, delta);
        assertEquals(mCalculator.mul(0d, 0d), 0, delta);
        assertEquals(mCalculator.mul(69.6428d, -1389.157d), -96744.78312d, delta);
        assertEquals(mCalculator.mul(999999999999d, 999999999999d), 999999999998000000000001d, delta);
        assertEquals(mCalculator.mul(-999999999999d, -999999999999d), 999999999998000000000001d, delta);
        assertEquals(mCalculator.mul(0d, 9999999999999999d), 0d, delta);
        assertEquals(mCalculator.mul(0d, -9999999999999999d), 0d, delta);
    }

    @Test
    public void pow() {
        assertEquals(mCalculator.pow(1d, Double.MAX_VALUE), 1d, delta);
        assertEquals(mCalculator.pow(Double.MAX_VALUE, 0d), 1d, delta);
        assertEquals(mCalculator.pow(-Double.MAX_VALUE, 0d), 1d, delta);
        assertEquals(mCalculator.pow(2d, 3d), 8d, delta);
        assertEquals(mCalculator.pow(9.6428d, 10d), 6950748779.63572882067471835923d, delta);
        assertEquals(mCalculator.pow(.00876d, .963d), .01043834037d, delta);
        assertEquals(mCalculator.pow(-25, 2), 625d, delta);
        assertEquals(mCalculator.pow(674d, -.5d), .03851856079d, delta);
    }

    @Test
    public void fac() {
        assertEquals(mCalculator.fac(0d), 1d, delta);
        assertEquals(mCalculator.fac(1d), 1d, delta);
        assertEquals(mCalculator.fac(0d), 1d, delta);
        assertEquals(mCalculator.fac(-999d), Double.NaN, delta);
        assertEquals(mCalculator.fac(69d), 171122452428141311372468338881272839092270544893520369393648040923257279754140647424000000000000000d, delta);
    }

    @Test
    public void log() {
        assertEquals(mCalculator.log(0d, 0d), Double.NaN, delta);
        assertEquals(mCalculator.log(1d, 1d), Double.NaN, delta);
        assertEquals(mCalculator.log(Double.MAX_VALUE, Double.MAX_VALUE), 1d, delta);
        assertEquals(mCalculator.log(1d, Double.MAX_VALUE), 0d, delta);
        assertEquals(mCalculator.log(9d, 6d), 1.226294386d, delta);
        assertEquals(mCalculator.log(6d, .5d), -2.584962501d, delta);
        assertEquals(mCalculator.log(.5d, 6d), -0.3868528072d, delta);
        assertEquals(mCalculator.log(999999999999d, 1.1d), 289.9062951d, delta);
    }
}