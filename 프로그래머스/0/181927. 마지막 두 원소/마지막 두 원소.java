class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;

        int[] answer = new int[len + 1];
        
        System.arraycopy(num_list, 0, answer, 0, len);
        
        int last = num_list[len - 1];
        int prev = num_list[len - 2];
        
        if (last > prev) {
            answer[len] = last - prev;
        } else {
            answer[len] = last * 2;
        }
        
        return answer;
    }
}