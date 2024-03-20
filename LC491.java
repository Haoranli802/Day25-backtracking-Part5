class Solution {
    List<List<Integer>> result;
    List<Integer> path;
    public List<List<Integer>> findSubsequences(int[] nums) {
        result = new ArrayList<>();
        path = new ArrayList<>();
        backTracking(nums, 0);
        return result;
    }
    private void backTracking(int[] nums, int start){
        if(path.size() > 1){
            result.add(new ArrayList<>(path));
            //return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = start; i < nums.length; i++){
            if(set.contains(nums[i])) continue;
            if(path.size() == 0 || (nums[i] >= path.get(path.size() - 1))){
                path.add(nums[i]);
                backTracking(nums, i+1);
                path.removeLast();
            }
            set.add(nums[i]);
        }
    }
}

//时间复杂度: O(n * 2^n)
//空间复杂度: O(n)
