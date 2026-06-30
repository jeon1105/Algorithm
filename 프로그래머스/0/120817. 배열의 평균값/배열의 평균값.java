class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double nums = 0;
        for(int num : numbers){
            nums += num ;
        }
        answer = nums/numbers.length;
        return answer;
    }
}