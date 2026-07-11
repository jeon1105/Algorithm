class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";
        for (int num : num_list) {
            if (num % 2 != 0) {
                oddStr += num;
            } else {
                evenStr += num;
            }
        }
        return Integer.parseInt(oddStr)+Integer.parseInt(evenStr);
    }
}