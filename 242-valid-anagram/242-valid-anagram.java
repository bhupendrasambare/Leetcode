class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] check = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            check[s.charAt(i)-'a'] += 1;
            check[t.charAt(i)-'a'] -= 1;
        }
        
        for(int i=0; i<26; i++) {
            if(check[i] != 0) return false;
        }
        
        return true;
    }
}