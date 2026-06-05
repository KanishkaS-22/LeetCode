// Last updated: 6/5/2026, 2:15:34 PM
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer>ans=new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            int t=i;
6            boolean target=true;
7            int c=0;
8            while(t>0){
9               int d=t%10;
10                if(d==0||i%d!=0){
11                    target=false;
12                    break;
13                }
14                t=t/10;
15            }
16        if(target==true){
17            ans.add(i);
18        }
19        }
20        return ans;
21    }
22}