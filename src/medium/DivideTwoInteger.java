package medium;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor) {

        long i = (long) dividend / (long) divisor;
        int answer;
        if(i > Integer.MAX_VALUE) answer = (int) (i-1);
        else if (i < Integer.MIN_VALUE) answer = (int) (i+1);
        else answer = (int) i;

        return answer;
    }
}
