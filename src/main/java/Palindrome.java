public class Palindrome {
    public Boolean isPalindrome(String s) {
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() > 2) {
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return true;
            }
        } else if (s.length() < 3) {
            return true;
        } else {
            return false;
        }
    }
}
