class Solution {
    public void func(int[] nums,int index, List<List<Integer>> ans)
    {
        if(index == nums.length)
        {
            ArrayList<Integer> ds = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            func(nums,index+1,ans);
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        func(nums,0,ans);
        return ans;
    }
}