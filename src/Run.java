import baekjoon.Factorial2;
import medium.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Run {

    public static int N;
    public static void main(String[] args) throws IOException {

        NthNode nthNode = new NthNode();
        NthNode input = new NthNode();
        NthNode.ListNode node = input.new ListNode(0);
        nthNode.removeNthFromEnd(node, 1);
    }
}
