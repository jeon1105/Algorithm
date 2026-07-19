import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {

        int sum = Arrays.stream(num_list).sum();

        int sumS = sum * sum;

        int product = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        
        return product < sumS ? 1 : 0;
    }
}