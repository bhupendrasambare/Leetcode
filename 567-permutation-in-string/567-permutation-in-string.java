class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character, Integer> mapS1CharAndCount = new HashMap<>();
        Map<Character, Integer> mapS2CharAndCount = new HashMap<>();
        int lenS1 = s1.length();
        
        mapS1CharAndCount = createMap(s1);
        
        int left = 0;
        int right = left+s1.length()-1;
        
        while(right<s2.length()){
            
            mapS2CharAndCount = createMap(s2.substring(left,right+1));
            if(areMapsEqual(mapS1CharAndCount, mapS2CharAndCount)) return true;
            left++;
            right++;
        }
        return false;
        
        
        }
    
    private Map<Character, Integer> createMap(String s){
        Map<Character, Integer> mapCharAndCount = new HashMap<>();
        for(Character c: s.toCharArray()){
            mapCharAndCount.put(c, mapCharAndCount.getOrDefault(c,0)+1) ;
        }
        return mapCharAndCount;
    }
    
    private boolean areMapsEqual(Map<Character, Integer> m1, Map<Character, Integer> m2){
     
        for(Character c: m1.keySet() ){
            if(m1.get(c) - m2.getOrDefault(c,0) !=0) return false;
        }
        return true;
    }
}