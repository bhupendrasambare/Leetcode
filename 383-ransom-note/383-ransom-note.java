class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineCount = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            magazineCount[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < ransomNote.length(); i++) {
            magazineCount[ransomNote.charAt(i) - 'a']--;
            if (magazineCount[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}