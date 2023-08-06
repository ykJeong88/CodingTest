package medium;

import java.util.Arrays;

public class ZigzagConversion {

    public String convert(String s, int numRows) {

        if(numRows == 1) return s;

        String answer= "";
        int index = 0;
        String[] answerArr = new String[numRows];
        Arrays.fill(answerArr,"");
        int rowCnt = 0;
        boolean checkPoint = true;

        while (index != s.length()) {

            if(checkPoint) {
                rowCnt++;
            } else {
                rowCnt--;
            }

            if(rowCnt == 1) {
                checkPoint = true;
            } else if (rowCnt == numRows) {
                checkPoint = false;
            }
            answerArr[rowCnt-1] = answerArr[rowCnt-1] + s.charAt(index);
            index++;
        }

        for(String str : answerArr) {
            answer += str;
        }

        return answer;
    }
}
