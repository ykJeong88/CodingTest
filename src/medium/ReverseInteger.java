package medium;

public class ReverseInteger {

    public int reverse(int x) {

        boolean isMinus = x >= 0?false:true;

        if(x == 0 || Long.parseLong(String.valueOf(x)) > Integer.MAX_VALUE || Long.parseLong(String.valueOf(x)) < Integer.MIN_VALUE
         || -Long.parseLong(String.valueOf(x)) > Integer.MAX_VALUE || -Long.parseLong(String.valueOf(x)) < Integer.MIN_VALUE
        ) return 0;

        x = Math.abs(x);
        while(x % 10 == 0) {
            x = x / 10;
        }

        StringBuilder xStr = new StringBuilder(String.valueOf(x>=0?x:x*-1));
        xStr.reverse();
        if(isMinus) {
            xStr = new StringBuilder("-" + xStr);
        }

        if(Long.parseLong(String.valueOf(xStr)) > Integer.MAX_VALUE || Long.parseLong(String.valueOf(xStr)) < Integer.MIN_VALUE) return 0;

        return Integer.valueOf(String.valueOf(xStr));
    }

}
