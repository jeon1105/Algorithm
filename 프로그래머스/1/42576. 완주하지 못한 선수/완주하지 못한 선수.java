import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String part : participant)
            map.put(part, map.getOrDefault(part, 0) + 1);

        for (String com : completion)
            map.put(com, map.get(com) - 1);

        for (String p : participant) 
            if (map.get(p) != 0) return p;

        return "";
    }
}