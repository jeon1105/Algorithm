import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] sorted = num_list.clone();
        Arrays.sort(sorted);
        
        int[] answer = new int[5];
        for (int i = 0; i < 5; i++) {
            answer[i] = sorted[i];
        }
        return answer;
    }
}