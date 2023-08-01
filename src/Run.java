import baekjoon.Factorial2;
import medium.AddTwoNumbers;
import medium.TwoSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Run {

    public static int N;
    public static void main(String[] args) throws IOException {

       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Factorial2 factorial2 = new Factorial2();
        int answer = factorial2.factorial(n);
        System.out.println(answer);*/

        int[] nums = new int[] {-3,4,3,90};
        int target = 0;

        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(nums, target);

    }
}
