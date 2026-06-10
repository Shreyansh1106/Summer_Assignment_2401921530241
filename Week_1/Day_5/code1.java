class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                t += Character.toLowerCase(ch); 
            }
        }
        int a=0,b=t.length()-1;
        while(a<b){
            if(t.charAt(a)!=t.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
