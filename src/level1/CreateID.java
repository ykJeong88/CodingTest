package level1;

public class CreateID {
    public String solution(String new_id) {
        String answer = "";


        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();
        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String rm_new_id = "";
        for(int i=0;i<new_id.length();i++) {
            char ch = new_id.charAt(i);
            String reg = "~!@#$%^&*()=+[{]}:?,<>/";
            if(reg.contains(String.valueOf(ch))) {
                continue;
            } else {
                rm_new_id += String.valueOf(ch);
            }
        }
        new_id = rm_new_id;
        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        String rmDotId = "";
        for(int i=0;i<new_id.length()-1;i++) {
            char ch = new_id.charAt(i);
            char ch_ = new_id.charAt(i+1);
            if(ch == '.' && ch_  == '.' ) {
                continue;
            } else {
                rmDotId += String.valueOf(ch);
            }
        }
        if(new_id.length() != 0 ) rmDotId += String.valueOf(new_id.charAt(new_id.length()-1));
        new_id = rmDotId;

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        int preIndex = 0;
        int sufIndex = 0;
        for(int i=0;i<new_id.length();i++) {
            char ch = new_id.charAt(i);
            if(ch != '.') {
                preIndex = i;
                break;
            }
        }
        for(int i=new_id.length()-1;i>-1;i--){
            char ch = new_id.charAt(i);
            if(ch != '.') {
                sufIndex = i;

                break;
            }
        }

        if(sufIndex != 0 ) new_id = new_id.substring(preIndex,sufIndex+1);


        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(new_id.length() == 0) {
            new_id = "a";
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.

        //        만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
        }

        if(new_id.charAt(new_id.length()-1) == '.') {
            new_id = new_id.substring(0,new_id.length()-1);
        }

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(new_id.length() == 0) {
            new_id = "a";
        }
        if(new_id.length() <= 2) {
            char addCh = new_id.charAt(new_id.length()-1);
            for(int i=new_id.length();i<3;i++) {
                new_id += String.valueOf(addCh);
            }
        }
        answer = new_id;
        return answer;
    }
}
