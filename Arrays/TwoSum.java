//Problem :Two Sum
//Approach:Use a HashMap to store visited elements and check for the complement
//Time Complexity:O(n)
//Space Complexity:O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] list=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])&&i!=map.get(target-nums[i])){
                list[0]=map.get(target-nums[i]);
                list[1]=i;
                break;
            }
             map.put(nums[i],i);
        }
        return list;
    }
}
