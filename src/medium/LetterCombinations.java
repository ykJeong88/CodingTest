package medium;

import java.util.*;

public class LetterCombinations {

//    public List<String> letterCombinations(String digits) {
//
//        List<String> answer = new ArrayList<>();
//        if("".equals(digits)) return new ArrayList<>();
//
//        String[] number2 = new String[] {"a","b","c"};
//        String[] number3 = new String[] {"d","e","f"};
//        String[] number4 = new String[] {"g","h","i"};
//        String[] number5 = new String[] {"j","k","l"};
//        String[] number6 = new String[] {"m","n","o"};
//        String[] number7 = new String[] {"p","q","r","s"};
//        String[] number8 = new String[] {"t","u","v"};
//        String[] number9 = new String[] {"w","x","y","z"};
//
//
//        int size = 1;
//        char[] digitArr = digits.toCharArray();
//        for(char ch : digitArr) {
//            if(ch == '7' || ch == '9') size = size * 4;
//            else size = size * 3;
//        }
//
//        String[] answerArr = new String[size];
//        Arrays.fill(answerArr, "");
//
//        int depth = answerArr.length;
//
//        for(int l = 0; l < digitArr.length; l++) {
//            String[] nowArr = null;
//            switch(digitArr[l]) {
//                case '2' : nowArr = number2; break;
//                case '3' : nowArr = number3; break;
//                case '4' : nowArr = number4; break;
//                case '5' : nowArr = number5; break;
//                case '6' : nowArr = number6; break;
//                case '7' : nowArr = number7; break;
//                case '8' : nowArr = number8; break;
//                case '9' : nowArr = number9; break;
//            }
//            depth = depth / nowArr.length;
//
//            int countDepth = 0;
//            int j = 0;
//            for(int i = 0; i < answerArr.length; i++)  {
//
//                if(countDepth == depth) {
//                    countDepth = 0;
//                    j = (j + 1) % nowArr.length;
//                }
//                answerArr[i] = answerArr[i] + nowArr[j];
//
//                countDepth++;
//
//            }
//        }
//
//        answer = Arrays.asList(answerArr);
//
//        return answer;
//    }
    static int count = 0;
    public List<String> letterCombinations(String digits) {
        digits = "23";
        List<String> res=new ArrayList<>();
        if(digits.length()==0) return res;
        Map<Character,String> hm=new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        backTrack(digits,0,hm,new StringBuilder(),res);
        return res;
    }
    private static void backTrack(String digits, int i,Map<Character,String> hm,StringBuilder sb,List<String>res){
        System.out.println(count++);
        System.out.println(res);
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }

        String curr=hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            backTrack(digits, i+1, hm,  sb, res);
            sb.deleteCharAt(sb.length() -1);

        }
    }
}
