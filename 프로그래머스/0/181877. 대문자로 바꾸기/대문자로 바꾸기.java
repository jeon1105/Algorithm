class Solution {
public String solution(String myString) {

  String result = "";
  for (int i = 0; i < myString.length(); i++) {
    char c = myString.charAt(i);
    if (Character.isLowerCase(c)) {
      result += Character.toUpperCase(c);
    }
    else {
      result += c;
    }
  }
  return result;
}
}