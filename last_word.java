class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) != ' ') {
            right--;
        }
        return s.length()-right-1;
    }
}