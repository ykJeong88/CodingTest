package medium;

public class LongestPalindrome {

    public String longestPalindrome(String s) {

        if(s.length()<=1) return s;

        String answer = "";

        // 문자열 +1 부터 for문
        for(int i = 1 ; i < s.length() ; i++ ) {
            //짝수일때
            int startIndex = i;
            int endIndex = i;

            while(s.charAt(startIndex) == s.charAt(endIndex)) {

                startIndex--;
                endIndex++;

                // 범위를 벗어날떄
                if(startIndex <= -1 || endIndex >= s.length()) break;
            }

            answer = s.substring(startIndex+1, endIndex).length() > answer.length() ? s.substring(startIndex+1, endIndex) : answer;

            //홀수일떄
            startIndex = i - 1;
            endIndex = i;

            while(s.charAt(startIndex) == s.charAt(endIndex)) {

                startIndex--;
                endIndex++;

                // 범위를 벗어날떄
                if(startIndex <= -1 || endIndex >= s.length()) break;
            }

            answer = s.substring(startIndex+1, endIndex).length() > answer.length() ? s.substring(startIndex+1, endIndex) : answer;
        }

        return answer;
    }


}

