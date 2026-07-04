import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> answer = new ArrayList<>();//<>여기엔 객체형이 원래는 들어가있는데 java 7부턴 생략 가능

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }

        int[] result = new int[answer.size()];
        //반환형이 지금 int 여서 integer -> int 로 변경이 필요함
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        Arrays.sort(result);

        return result;
    }
}