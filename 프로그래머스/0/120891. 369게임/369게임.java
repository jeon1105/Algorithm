import java.util.*;

class Solution {
    public int solution(int order) {
        int[] arr = String.valueOf(order).chars().map(Character::getNumericValue).toArray();
    int count = 0;
    for(int i = 0; i < arr.length; i++){
            if (arr[i] == 3 || arr[i] == 6 || arr[i] == 9){
                count++;
            }
        }
        return count;
    }
}