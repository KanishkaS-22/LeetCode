// Last updated: 6/12/2026, 1:52:49 PM
1class Solution {
2     public void sortColors(int[] arr) {
3        // code here
4        int n=arr.length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n-i-1;j++){
7                if(arr[j]>arr[j+1]){
8                    int temp=arr[j];
9                    arr[j]=arr[j+1];
10                    arr[j+1]=temp;
11                }
12            }
13        }
14    }
15}