package medium;

public class IntegerToRoman {

    int inputNum = 0;
    static final int I = 1;
    static final int V = 5;
    static final int X = 10;
    static final int L = 50;
    static final int C = 100;
    static final int D = 500;
    static final int M = 1000;
    public String intToRoman(int num) {
        inputNum = num;
        String answer = "";
        boolean bool = true;

        while(bool) {

            String s = recursive(inputNum);
            if("".equals(s)) bool = false;

            answer = answer + s;
        }

        return answer;
    }

    public String recursive(int num) {

        String returnStr = "";
        String alph = "";
        int minus = 0;
        int repeat = 0;

        if(num / M >= 1) {
            repeat = num / M;
            minus = M * repeat;
            alph = "M";
        }
        else if(num / D >= 1) {
            repeat = num / D;
            minus = D * repeat;
            alph = "D";
        }
        else if(num / C >= 1) {
            repeat = num / C;
            minus = C * repeat;
            alph = "C";
        }
        else if(num / L >= 1) {
            repeat = num / L;
            minus = L * repeat;
            alph = "L";
        }
        else if(num / X >= 1) {
            repeat = num / X;
            minus = X * repeat;
            alph = "X";
        }
        else if(num / V >= 1) {
            repeat = num / V;
            minus = V * repeat;
            alph = "V";
        }
        else if(num / I >= 1) {
            repeat = num / I;
            minus = I * repeat;
            alph = "I";
        }
        else {
            alph = "";
        }

        if(num < M && num / 900 == 1) {
            repeat = 1;
            minus = 900;
            alph = "CM";
        } else if (num < D && num / 400 == 1) {
            repeat = 1;
            minus = 400;
            alph = "CD";
        } else if (num < C && num / 90 == 1) {
            repeat = 1;
            minus = 90;
            alph = "XC";
        } else if (num < L && num / 40 == 1) {
            repeat = 1;
            minus = 40;
            alph = "XL";
        } else if (num < X && num / 9 == 1) {
            repeat = 1;
            minus = 9;
            alph = "IX";
        } else if (num < V && num / 4 == 1) {
            repeat = 1;
            minus = 4;
            alph = "IV";
        }

        inputNum = inputNum - minus;
        System.out.println(inputNum);
        for(int i = 1 ; i <= repeat; i++) {
            returnStr = returnStr + alph;
        }

        return returnStr;
    }

}
