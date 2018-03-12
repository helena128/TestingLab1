package main.java;

import static java.lang.Math.*;

/**
 * Class performing operation
 */
public class Calculator {
    public static final Double EPS = 1e-10; // mistake

    public double calculateArcCos(double x) {
        // check the range for x
        if (!checkRange(x)) throw new IllegalArgumentException("X is not in the range");

        int numSteps = 5; // default number of steps
        double prevSum, sum = 0, xn;
        for (int i = 0; i < numSteps; i++) {
            prevSum = sum;
            xn = calculateMember(i) * pow(x, (2 * i + 1));
            sum += xn;

            if (abs(sum - prevSum) > EPS) {
                numSteps++;
            }
        }
        return (PI / 2 - sum);
    }

    private double fact(int x) {
        double res = 1;
        for (int i = x; i > 0; i--) {
            res *= i;
        }
        return res;
    }

    private double calculateMember(int n) {
        return fact(2 * n) / (pow(4, n) * pow(fact(n), 2) * (2 * n + 1));
    }

    /**
     * Checks that x value lies in an appropriate range
     * @param x
     * @return
     */
    private boolean checkRange(double x) {
        return (abs(x) <= 1); // TODO: or <=
    }
}
