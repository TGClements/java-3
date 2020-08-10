package lambda_streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
        System.out.println(nums);

        System.out.println(added(nums));
        System.out.println(subtracted(nums));
        System.out.println(multipled(nums));
        System.out.println(divided(nums));
        System.out.println(findMax(nums));
        System.out.println(findMin(nums));

        System.out.println(compare(0, 1));

        System.out.println(append(20000));
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:

        // Lambdas

        lambdaIsOddEvenPrime lio = (i) -> i % 2 != 0;
        boolean result0 = lio.isOddEvenPrime(nums.get(3));
        System.out.println(result0);

        lambdaIsOddEvenPrime lie = (i) -> i % 2 == 0;
        boolean result1 = lie.isOddEvenPrime(nums.get(3));
        System.out.println(result1);

        lambdaIsOddEvenPrime lip = (i) -> {
            if (i % 2 == 0)
                return false;
            for (int n = 3; n * n <= i; n += 2) {
                if (i % n == 0)
                    return false;
            }
            return true;
        };
        boolean result2 = lip.isOddEvenPrime(nums.get(3));
        System.out.println(result2);

        lambdaAddSubMultDiv la = (i) -> BigInteger.valueOf(nums.stream().mapToInt(w -> w).sum());
        BigInteger result3 = la.addSubMultDiv(nums);
        System.out.println(result3);

        lambdaAddSubMultDiv ls = (i) -> BigInteger.valueOf(nums.stream().mapToInt(w -> -w).sum());
        BigInteger result4 = ls.addSubMultDiv(nums);
        System.out.println(result4);

        lambdaAddSubMultDiv lm = (i) -> nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE,
                BigInteger::multiply);
        BigInteger result5 = lm.addSubMultDiv(nums);
        System.out.println(result5);

        lambdaAddSubMultDiv ld = (i) -> nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE,
                BigInteger::divide);
        BigInteger result6 = ld.addSubMultDiv(nums);
        System.out.println(result6);

        lambdaFindMinMax lfn = (i) -> nums.stream().max(Integer::compare).get();
        int result7 = lfn.findMinMax(nums);
        System.out.println(result7);

        lambdaFindMinMax lfx = (i) -> nums.stream().min(Integer::compare).get();
        int result8 = lfx.findMinMax(nums);
        System.out.println(result8);

        lambdaCompare lc = (i, j) -> nums.indexOf(i) == nums.indexOf(j) ? 0
                : nums.indexOf(i) > nums.indexOf(j) ? 1 : -1;
        int result9 = lc.compare(nums.get(0), nums.get(1));
        System.out.println(result9);

        lambdaAppend lap = (n) -> {
            Stream<Integer> myStream = nums.stream();
            Stream<Integer> myStream2 = Stream.concat(myStream, Stream.of(n));

            List<Integer> resultList = myStream2.collect(Collectors.toList());
            nums = resultList;

            return n;
        };
        int result10 = lap.append(200000);
        System.out.println(result10);
        System.out.println(nums);
    }

    static interface lambdaIsOddEvenPrime {
        public boolean isOddEvenPrime(int i);
    }

    static interface lambdaAddSubMultDiv {
        public BigInteger addSubMultDiv(List<Integer> nums);
    }

    static interface lambdaFindMinMax {
        public int findMinMax(List<Integer> nums);
    }

    static interface lambdaCompare {
        public int compare(int i, int j);
    }

    static interface lambdaAppend {
        public int append(int n);
    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        // lambdaIsOdd();

        return i % 2 != 0;
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        return i % 2 == 0;
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        if (i % 2 == 0)
            return false;
        for (int n = 3; n * n <= i; n += 2) {
            if (i % n == 0)
                return false;
        }
        return true;
    }

    static int added(List<Integer> nums) {
        //add all the elements in the list.  return the sum.  

        return nums.stream().mapToInt(w -> w).sum();
    }

    static int subtracted(List<Integer> nums) {
        //subtract all the elements in the list. return the remainder.

        return nums.stream().mapToInt(w -> -w).sum();
    }

    static BigInteger multipled(List<Integer> nums) {
        //multiply all the elements in the list. and return the product.

        return nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
    }

    static float divided(List<Integer> nums) {
        //divide all the elements in the list. and return the product.
        BigInteger divide = nums.stream().map(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::divide);
        return divide.floatValue();
    }

    static int findMax(List<Integer> nums) {
        //return the maximum value in the list.
        return nums.stream().max(Integer::compare).get();
    }

    static int findMin(List<Integer> nums) {
        //return the minimum value in the list.
        return nums.stream().min(Integer::compare).get();
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.

        return nums.indexOf(i) == nums.indexOf(j) ? 0 : nums.indexOf(i) > nums.indexOf(j) ? 1 : -1;
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.

        Stream<Integer> myStream = nums.stream();
        Stream<Integer> myStream2 = Stream.concat(myStream, Stream.of(n));

        List<Integer> resultList = myStream2.collect(Collectors.toList());
        nums = resultList;

        return n;
    }

}
