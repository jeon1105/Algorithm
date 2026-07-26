class Solution {
    public int solution(int[] box, int n) {
        int num = 1;
        for (int i=0; i<box.length; i++){
            num *= box[i]/n;
        }
        return num;
    }
}