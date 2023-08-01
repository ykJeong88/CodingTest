package baekjoon;

public class Factorial2 {

    int answer = 1;
    public int factorial(int n) {
        boolean bool = true;
        while(bool) {
            bool = reculsive(n--);
        }

        return answer;
    }

    private boolean reculsive(int n) {

        if(n <= 0) return false;
        else {
            answer = answer * n;
            return true;
        }
    }
}
