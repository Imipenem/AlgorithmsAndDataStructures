package main.java.Week1.Week1_DivideAndConquer;

import java.math.BigInteger;

public class KaratsubaImpl {
    public static void main(String[] args) {
        //only for implementation testing
        KaratsubaImpl obj = new KaratsubaImpl();
        System.out.println(obj.karatsuba(new BigInteger("0"), new BigInteger("0")));
    }

    /**
     * With this method, I try to implement the famous Karatsuba Algorithm to calculate large integer multiplications.
     * It uses the BigInteger class and the common recursive "Divide and Conquer"- approach
     *
     * @param x the first number
     * @param y the second number
     * @return the product of x times y (e.g x*y)
     */
    public BigInteger karatsuba(BigInteger x, BigInteger y) {
        int n = Math.max(x.toString().length(),y.toString().length()); //could be float/long since for large input, n can be outside the range of integer representation
        n = n / 2 + (n % 2);

        if (x.compareTo(BigInteger.TEN) < 0 && y.compareTo(BigInteger.TEN) < 0) {  // base case: single digit multiplication
            return x.multiply(y);
        } else {
            BigInteger[] xL_xH = x.divideAndRemainder(BigInteger.valueOf(10).pow(n)); //calculating the two halves of x
            BigInteger xH = xL_xH[0];
            BigInteger xL = xL_xH[1];

            BigInteger[] yL_yH = y.divideAndRemainder(BigInteger.valueOf(10).pow(n)); //calculating the two halves of y
            BigInteger yH = yL_yH[0];
            BigInteger yL = yL_yH[1];

            BigInteger firstStep = karatsuba(xH, yH);
            BigInteger secStep = karatsuba(xL, yL);
            BigInteger thirdStep = karatsuba(xL.add(xH), yL.add(yH));
            BigInteger fourthStep = thirdStep.subtract(secStep).subtract(firstStep);

            return firstStep.multiply(BigInteger.valueOf(10).pow(n * 2)).add(secStep).add(fourthStep.multiply(BigInteger.valueOf(10).pow(n)));
        }
    }
}
