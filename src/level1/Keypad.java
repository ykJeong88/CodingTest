package level1;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int leftNum = 10;
        int rightNum = 12;

        for(int i=0;i<numbers.length;i++) {

            int number = numbers[i];
            int rightMove = 0;
            int leftMove = 0;

            if(number==0)  number = 11;

            //왼손 기준
            if(number == 1 || number == 4 || number == 7) {
                leftNum = number;
                answer += "L";
            } else if (number == 3 || number == 6 || number == 9) {
                rightNum = number;
                answer += "R";
            }
            // 이거 외의 경우 2,5,8,0
            else {
                leftMove = (Math.abs(number-leftNum) / 3 ) + (Math.abs(number-leftNum) % 3);

                rightMove = (Math.abs(number-rightNum) / 3 ) + (Math.abs(number-rightNum) % 3);

                if(leftMove == rightMove) {
                    if("right".equals(hand)) {
                        answer += "R";
                        rightNum = number;;
                    }
                    else {
                        answer += "L";
                        leftNum = number;
                    }
                } else if (leftMove > rightMove) {
                    answer += "R";
                    rightNum = number;;

                } else {
                    answer += "L";
                    leftNum = number;
                }

            }

        }

        return answer;
    }
}
