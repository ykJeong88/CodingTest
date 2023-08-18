package medium;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.awt.*;
import java.util.*;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        List<String> answer = new ArrayList<>();
        String str = "";

        dfs(answer, "", 0, 0, n);
        return answer;
    }

    public void dfs(List<String> answer, String str, int open, int close, int n){

        if(str.length() == n * 2) {
            answer.add(str);
            return;
        }

        if(open < n) dfs(answer, str+"(", open+1, close, n);
        if(close < open) dfs(answer, str+")", open, close + 1, n);

        // stack
        // dfs root -> dfs open 1 -> dfs open 2 -> dfs open 2, close 1 -> dfs open 2, close 2 -> add (()) return
        // return -> before call close ->  dfs open 1, close1 -> dfs open 2 close 1 -> dfs open2 close2 - > add ()() return
        // dfs open 1, close 1 - > close 2 (close(1) < open (1)) not call -> end
    }

}
