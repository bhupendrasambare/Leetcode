class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
    
        for(int i=0;i<arr.length;i++){
            if(mapp.containsKey(arr[i])){
                mapp.put(arr[i],mapp.get(arr[i])+1);
            }
            else{
                mapp.put(arr[i],1);
            }
        }

        HashMap<Integer, Integer> second = new HashMap<>();

         for (Integer count : mapp.values()){
             if(second.containsKey(count)){
                 return false;
             }
             else{
                 second.put(count,1);
             }
         }
        return true;
    }
}