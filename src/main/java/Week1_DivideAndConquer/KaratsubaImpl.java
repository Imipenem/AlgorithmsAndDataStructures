package main.java.Week1_DivideAndConquer;

import java.math.BigInteger;

public class KaratsubaImpl {
    public static void main(String[] args) {
        //only for implementation step tests
        //KaratsubaImpl obj = new KaratsubaImpl();
        //System.out.println(obj.karatsuba(new BigInteger("10000000000000000000000002"), new BigInteger("565656565656565656565656")));
        //System.out.println(new BigInteger("2").multiply(new BigInteger("222222236236273627372163271637263762163762173612786371237612637261731278376217361276372167361276372163761273672163762176327163761237621")));
    }

    /**
     * With this method, I try to implement the famous Karatsuba Algorithm to calculate large integer multiplications.
     * It uses the BigInteger class and the common recursive "Divide and Conquer"- approach
     * NOTE: While creating the test cases, I recognized this will take the longer, the more the input differs in length!
     *
     * @param x the first number
     * @param y the second number
     * @return the product of x times y (e.g x*y)
     */
    public BigInteger karatsuba(BigInteger x, BigInteger y) {
        int n = x.toString().length(); //could be float/long since for large input, n can be outside the range of integer representation
        n = n / 2 + (n % 2);

        if (x.compareTo(BigInteger.TEN) < 0 && y.compareTo(BigInteger.TEN) < 0) {
            return x.multiply(y);
        } else {
            BigInteger[] xL_xH = x.divideAndRemainder(BigInteger.valueOf(10).pow(n));
            BigInteger xH = xL_xH[0];
            BigInteger xL = xL_xH[1];

            BigInteger[] yL_yH = y.divideAndRemainder(BigInteger.valueOf(10).pow(n));
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
