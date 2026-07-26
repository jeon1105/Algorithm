import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int len = numbers.length;
        
        int a1 = numbers[0] * numbers[1];
        int a2 = numbers[len-1] * numbers[len-2];
        return Math.max(a1, a2);
    }
}