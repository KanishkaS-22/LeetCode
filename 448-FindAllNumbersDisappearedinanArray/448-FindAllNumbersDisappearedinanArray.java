// Last updated: 7/11/2026, 10:24:41 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] arr) {
3        List<Integer>ll=new ArrayList<>();
4        for(int i=0;i<arr.length;i++){
5            int index=Math.abs(arr[i])-1;
6            if(arr[index]>0){
7                arr[index]=arr[index]*-1;
8            }
9        }
10        for(int i=0;i<arr.length;i++){
11            if(arr[i]>0){
12                ll.add(i+1);
13            }
14        }
15        return ll;
16    }
17}
18  