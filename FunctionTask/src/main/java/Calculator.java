package main.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.*;

/**
 * Class performing operation
 */
public class Calculator {
    private static final int NUM_STEPS = 400;

    public double calculateArcCos(double x) {
        // check the range for x
        if (!checkRange(x)) throw new IllegalArgumentException("X is not in the range! X = " + x);

        BigDecimal sum = BigDecimal.ZERO, xn;
        for (int i = 0; i < NUM_STEPS; i++) {
            xn = calculateCoefficient(i).multiply((BigDecimal.valueOf(x)).pow(2 * i + 1));
            sum = sum.add(xn);
        }

        return (BigDecimal.valueOf(PI / 2).subtract(sum)).doubleValue();
    }

    /**
     * Calculate factorial
     * @param x
     * @return
     */
    private BigDecimal fact(int x) {
        BigDecimal res = BigDecimal.ONE;

        if (x <= 0) return res;

        for (int i = x; i > 0; i--) {
            res = res.multiply(BigDecimal.valueOf(i));
        }
        return res;
    }

    /**
     * Calculates the number to be multiplied by
     * @param n
     * @return
     */
    public BigDecimal calculateCoefficient(int n) {
        BigDecimal divider = BigDecimal.valueOf(4).pow(n);
        divider = divider.multiply(fact(n).pow(2));
        divider = divider.multiply(BigDecimal.valueOf(2 * n + 1));
        return fact(2 * n).divide(divider, 10, RoundingMode.HALF_EVEN);
    }

    /**
     * Checks that x value lies in an appropriate range
     * @param x
     * @return
     */
    private boolean checkRange(double x) {
        return (abs(x) <= 1);
    }
}