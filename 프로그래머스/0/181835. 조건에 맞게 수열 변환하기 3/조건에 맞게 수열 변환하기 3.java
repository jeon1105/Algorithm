class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        // k가 홀수인지 짝수인지 확인
        boolean isOdd = (k % 2 != 0);
        
        for (int i = 0; i < arr.length; i++) {
            if (isOdd) {
                answer[i] = arr[i] * k; 
            } else {
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}