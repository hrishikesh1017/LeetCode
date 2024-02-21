class Solution {
    public boolean isSubsequence(String s, String t) {
        int first_s = 0;
        if (s.isEmpty()){return true;}
        for(int i=0; i<t.length(); i++){
            if(s.charAt(first_s)==t.charAt(i)){first_s++;}
            if(first_s==s.length()){return true;}
        }
        return false;
    }
}