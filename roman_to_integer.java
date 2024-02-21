class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>h1 = new HashMap();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        char[] alpha = s.toCharArray();
        int num=0;
        int pt=0;
        while(pt+1<=alpha.length){
            if(pt==alpha.length-1 || h1.get(alpha[pt])>=h1.get(alpha[pt+1])){
                num=num+h1.get(alpha[pt]);
                pt=pt+1;
            }
            else{
                num=num+h1.get(alpha[pt+1])-h1.get(alpha[pt]);
                pt=pt+2;                
            }
        }
        return num;
    }
}