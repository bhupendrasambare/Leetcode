class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(freq.containsKey(s.charAt(i)))
                freq.put(s.charAt(i), freq.get(s.charAt(i))+1);
            else
                freq.put(s.charAt(i), 1);
        }

        for(int i=0;i<n;i++){
            if((int)freq.get(s.charAt(i)) == 1)
                return i;
        }
        
        return -1;
    }
}