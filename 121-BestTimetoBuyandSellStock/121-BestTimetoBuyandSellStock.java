// Last updated: 6/27/2026, 11:26:21 AM
1// class Solution {
2//     public int countPrimes(int n) {
3//     int cp=0;
4//         for(int i=2;i<n;i++){
5//             int c=0;
6//             for(int j=1;j<=i;j++){
7//                 if(i%j==0){
8//                     c++;
9//                 }
10//             }
11//         if(c==2){
12//             cp++;
13//         }
14//         }
15// return cp;
16//     }
17// }
18class Solution {
19
20    public int countPrimes(int n) {
21
22        boolean[] prime = new boolean[n];
23
24        for(int i = 0; i < n; i++) {
25            prime[i] = true;
26        }
27
28        for(int i = 2; i * i < n; i++) {
29
30            if(prime[i]) {
31
32                for(int j = i * i; j < n; j += i) {
33                    prime[j] = false;
34                }
35            }
36        }
37
38        int count = 0;
39
40        for(int i = 2; i < n; i++) {
41
42            if(prime[i]) {
43                count++;
44            }
45        }
46
47        return count;
48    }
49}