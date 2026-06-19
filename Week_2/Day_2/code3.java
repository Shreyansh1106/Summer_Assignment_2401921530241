class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length()<p.length()) return ans;
        int[] pCou=new int[26];
        int[] sCou=new int[26];
        for (char c : p.toCharArray()) {
            pCou[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            sCou[s.charAt(i)-'a']++;
            if (i>=p.length()) {
                sCou[s.charAt(i-p.length())-'a']--;
            }
            if (Arrays.equals(pCou, sCou)) {
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}
