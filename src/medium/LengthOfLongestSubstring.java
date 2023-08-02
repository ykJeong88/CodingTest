package medium;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0 ) return 0;

        int max = 0; // 반복하지 않느 최대값
        int temp = 0; // 비교용
        String repeat = "" + s.charAt(0); // 현재 문자열
        s = s.substring(1);

        //반복 문자열을 찾아서
        //남은 문자열이 반복문자열로 시작하는지 확인

        while(s.length() != 0)  {


            // 반복문자열이 현재문자열을 포함하고있지 않다면 반복문자열에 추가해주기
            if(!repeat.contains(String.valueOf(s.charAt(0)))) {
                repeat += s.charAt(0);
            } else {
                temp = repeat.length();
                max = Math.max(max,temp);
                // 포함되어있다면 포함되지 않은 부분부터 반복시작
                repeat = repeat.substring(repeat.indexOf(String.valueOf(s.charAt(0))) + 1) + s.charAt(0);
            }

            //사용한 문자 제거
            s = s.substring(1);
        }

        max = Math.max(max, repeat.length());

        return max;
    }
}
