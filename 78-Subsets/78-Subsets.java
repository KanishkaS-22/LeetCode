// Last updated: 9/2/2026, 12:13:10 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>>ans=new ArrayList<>();
4        backtrack(nums,0,new ArrayList<>(),ans);
5        return ans;
6    }
7    void backtrack(int[]nums,int index,
8    List<Integer>list,
9    List<List<Integer>>ans){
10        ans.add(new ArrayList<>(list));
11        for(int i=index;i<nums.length;i++){
12            list.add(nums[i]);
13            backtrack(nums,i+1,list,ans);
14            list.remove(list.size()-1);
15        }
16    }
17}