class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer = k*2000 + n*12000;
        int sum = n/10;
        answer -= sum * 2000;
        return answer;
    }
}