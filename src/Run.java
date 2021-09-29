import level1.CreateID;
import level1.Lotto;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {

        //로또의 최고 순위와 최저 순위
//        Lotto lotto = new Lotto();
//        int[] answer = lotto.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
//        System.out.println(Arrays.toString(answer));
        String answer = new CreateID().solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(answer);
    }
}
