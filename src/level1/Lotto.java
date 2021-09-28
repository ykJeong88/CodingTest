package level1;
import java.util.HashMap;
import java.util.Map;

public class Lotto {

    public int[] solution(int[] lottos, int[] win_nums) {


        int count = 0;
        int removeCnt = 0;
        Map<Integer,Integer> winMap = new HashMap<>();
        for(int i=0; i< win_nums.length;i++) {
            winMap.put(win_nums[i], win_nums[i]);
        }

        for(int i=0; i<lottos.length;i++) {
            int num = lottos[i];

            if(winMap.containsKey(num)){
                count++;
            }

            if(num == 0) {
                removeCnt++;
            }
        }

        int maxCnt = count + removeCnt;
        int minCnt = count;

        int maxRank = 0;
        int minRank = 0;

        maxRank = rank(maxCnt);
        minRank = rank(minCnt);

        int[] answer = {maxRank, minRank};


        return answer;
    }

    public int rank (int num) {
        int rank = 0;
        switch (num) {
            case 6 : rank = 1; break;
            case 5 : rank = 2; break;
            case 4 : rank = 3; break;
            case 3 : rank = 4; break;
            case 2 : rank = 5; break;
            default: rank = 6; break;
        }

        return rank;
    }
}
