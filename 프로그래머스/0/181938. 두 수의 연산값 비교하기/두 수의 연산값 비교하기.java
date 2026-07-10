class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a) + String.valueOf(b);
        if(Integer.parseInt(str) > 2*a*b){
            return Integer.parseInt(str);
        }
        return 2*a*b;
    }
}