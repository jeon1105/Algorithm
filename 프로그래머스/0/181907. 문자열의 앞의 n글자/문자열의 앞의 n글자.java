class Solution {
    public String solution(String my_string, int n) {
        // 0번째 인덱스부터 n번째 인덱스 전(즉, n개의 글자)까지 잘라냅니다.
        return my_string.substring(0, n);
    }
}