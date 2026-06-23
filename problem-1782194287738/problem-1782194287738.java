// Last updated: 6/23/2026, 11:28:07 AM
1class Solution {
2    public void sortColors(int[] arr) {
3      for(int i=0;i<arr.length;i++){
4        for(int j=0;j<arr.length-i-1;j++){
5            if(arr[j]>arr[j+1]){
6                int t=arr[j];
7                arr[j]=arr[j+1];
8                arr[j+1]=t;
9            }
10        }
11      }
12    }
13}