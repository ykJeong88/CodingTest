package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        digits = "9387";
        List<String> answer = new ArrayList<>();
        if("".equals(digits)) return new ArrayList<>();

        String[] number2 = new String[] {"a","b","c"};
        String[] number3 = new String[] {"d","e","f"};
        String[] number4 = new String[] {"g","h","i"};
        String[] number5 = new String[] {"j","k","l"};
        String[] number6 = new String[] {"m","n","o"};
        String[] number7 = new String[] {"p","q","r","s"};
        String[] number8 = new String[] {"t","u","v"};
        String[] number9 = new String[] {"w","x","y","z"};


        int size = 1;
        char[] digitArr = digits.toCharArray();
        for(char ch : digitArr) {
            if(ch == '7' || ch == '9') size = size * 4;
            else size = size * 3;
        }

        String[] answerArr = new String[size];
        Arrays.fill(answerArr, "");

        for(int l = 0; l < digitArr.length; l++) {
            String[] nowArr = null;
            switch(digitArr[l]) {
                case '2' : nowArr = number2; break;
                case '3' : nowArr = number3; break;
                case '4' : nowArr = number4; break;
                case '5' : nowArr = number5; break;
                case '6' : nowArr = number6; break;
                case '7' : nowArr = number7; break;
                case '8' : nowArr = number8; break;
                case '9' : nowArr = number9; break;
            }
            int depth = (int) (answerArr.length / Math.pow(nowArr.length, l+1));
            System.out.println(depth);
            System.out.println(answerArr.length);
            int countDepth = 0;
            int j = 0;
            for(int i = 0; i < answerArr.length; i++)  {

                if(countDepth == depth) {
                    countDepth = 0;
                    j = (j + 1) % nowArr.length;
                }
                answerArr[i] = answerArr[i] + nowArr[j];

                countDepth++;

            }
        }

        answer = Arrays.asList(answerArr);

        return answer;
    }

}
