package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A3Sum {
    // -2 0 1 1 2
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {

            if(i > 0 && nums[i] == nums[i-1]) continue;
            int lt = i+1;
            int rt = nums.length - 1;


            while (lt < rt) {

                int sum = nums[i] + nums[lt] + nums[rt];

                if (sum == 0) {

                    List<Integer> sumList = new ArrayList<>();
                    sumList.add(nums[i]);
                    sumList.add(nums[lt]);
                    sumList.add(nums[rt]);
                    answer.add(sumList);

                    while(nums[lt] == nums[lt+1]) {
                        lt++;
                        if(lt == nums.length -1) break;
                    }

                    while(nums[rt] == nums[rt-1]) {
                        rt--;
                        if (rt == 0) break;
                    }
                }

                if (sum <= 0) {
                    lt++;
                } else {
                    rt--;
                }
            }
        }

        return answer;
    }
}
