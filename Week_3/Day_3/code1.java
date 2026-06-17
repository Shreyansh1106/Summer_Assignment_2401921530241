class Solution {
    public int lengthOfLongestSubstring(String s) {
        int temp[]=new int[128];
        int j=0,k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            j=Math.max(j,temp[c]);
            k=Math.max(k,i-j+1);
            temp[c]=i+1;
        }
        return k;
    }
}
