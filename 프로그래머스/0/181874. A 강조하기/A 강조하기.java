class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') {
                answer.append('A');
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        
        return answer.toString();
    }
}