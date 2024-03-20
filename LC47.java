class Solution {
    List<List<Integer>> result;
    List<Integer> path;
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();
        path = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backTracking(nums, used);
        return result;
    }
    private void backTracking(int[] nums, boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] == nums[i] && used[i - 1] == false) continue;
            if(!used[i]){
                path.add(nums[i]);
                used[i] = true;
                backTracking(nums, used);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}

//时间复杂度: O(n! * n)
//空间复杂度: O(n)
