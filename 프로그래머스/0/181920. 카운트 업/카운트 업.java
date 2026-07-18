import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int n = end_num - start_num + 1;
        int[] arr = new int[n];
        
        Arrays.setAll(arr, i -> start_num + i);
        
        return arr;
    }
}