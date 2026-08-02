class Solution {
    public int solution(String myString, String pat) {
        boolean result = myString.toLowerCase().contains(pat.toLowerCase());
        return result ? 1 : 0;
    }
}