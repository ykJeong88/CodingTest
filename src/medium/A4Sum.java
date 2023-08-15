package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3 ; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j= i+1; j<nums.length -2; j++) {

                if(j > i+1 && nums[j] == nums[j-1]) continue;

                long a = nums[i];
                long b = nums[j];
                int k = j+1;
                int l = nums.length -1;
                while (k<l) {
                    List<Integer> list = new ArrayList<>();
                    long c = nums[k];
                    long d = nums[l];

                    long sum = a+b+c+d;
                    if(Integer.MIN_VALUE > (int) sum) {
                        k++;
                        continue;
                    }

                    if(Integer.MAX_VALUE < (int) sum) {
                        l--;
                        continue;
                    }

                    if(target == sum) {
                        list.add((int) a);
                        list.add((int) b);
                        list.add((int) c);
                        list.add((int) d);
                        if(!answer.contains(list)) answer.add(list);
                    }

                    if(sum < target) k++;
                    else l--;
                }
            }
        }

        return answer;
    }
}
