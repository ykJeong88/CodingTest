package medium;

public class StringtoInteger {

    public int myAtoi(String s) {

        String answerStr = "";
        char[] strArr = s.toCharArray();
        for(int i = 0; i < strArr.length; i++) {

            char ch = strArr[i];

            if(ch == ' ' && answerStr.length() == 0) continue;

            if(Character.isDigit(ch)) answerStr += ch;
            else if ((ch == '-' || ch == '+') && strArr.length - 1 != i && Character.isDigit(strArr[i+1]) && answerStr.length() == 0) {
                answerStr += ch;
            }
            else break;

            if(!"-".equals(answerStr) && !"+".equals(answerStr)) {
                long longAnswer = Long.parseLong(answerStr);
                if (longAnswer > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else if (longAnswer < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }

        }
        answerStr = answerStr.length() == 0 || "-".equals(answerStr) ? "0":answerStr;

        return Integer.parseInt(answerStr);
    }
}
