// Last updated: 6/12/2026, 1:54:24 PM
1class Solution {
2    public void sortColors(int[] arr) {
3        int n=arr.length;
4        for(int i=0;i<n;i++){
5            for(int j=0;j<n-i-1;j++){
6                if(arr[j]>arr[j+1]){
7                    int temp=arr[j];
8                    arr[j]=arr[j+1];
9                    arr[j+1]=temp;
10                }
11            }
12        }
13    }
14}