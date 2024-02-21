public class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        char[] characters = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(characters[i]=='('||characters[i]=='{'||characters[i]=='['){
                st.push(characters[i]);
            }
            else{ 
                if(st.isEmpty()){
                    return false;
                }
                else if(characters[i]==')'&&st.pop()!='('||
                        characters[i]=='}'&&st.pop()!='{'||
                        characters[i]==']'&&st.pop()!='['){
                    return false;
                }           
            }
        }
    return st.isEmpty();    
    }
    
}