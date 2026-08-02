import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] my_string) {
        List<String> answerList = new ArrayList<>();
        
        for (String str : my_string) {
            if (!str.contains("ad")) {
                answerList.add(str);
            }
        }
        
        return answerList.toArray(new String[0]);
    }
}