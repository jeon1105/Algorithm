import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String numstr = my_string.replaceAll("[^0-9]", "");
        char[] chars = numstr.toCharArray();
        Arrays.sort(chars);
        
        int[] answer = new int[chars.length];
        for (int i=0; i < chars.length; i++){
            answer[i] = Character.getNumericValue(chars[i]);
        }
        return answer;
        }
}