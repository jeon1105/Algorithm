class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length / n;
        if (num_list.length % n != 0) {
            size++;
        }
        
        int[] answer = new int[size];
        int a = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[a] = num_list[i];
            a++;
        }
        return answer;
    }
}