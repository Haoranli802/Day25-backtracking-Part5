class Solution {
    List<List<Integer>> result;
    List<Integer> path;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, used);
        return result;
    }
    private void helper(int[] nums, boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                used[i] = true;
                path.add(nums[i]);
                helper(nums, used);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}
//时间复杂度: O(n * n!) 因为helper function调用次数是O(n!) 然后每次都需要O(n) 来复制path到result里面

//空间复杂度: O(n)
