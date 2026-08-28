// Last updated: 8/28/2026, 11:24:02 PM
1class Solution {
2    public String lexPalindromicPermutation(String s, String target) {
3        int[] count = new int[26];
4        for (char ch : s.toCharArray()) {
5            count[ch - 'a']++;
6        }
7        int odd = 0;
8        char middle = 0;
9        for (int i = 0; i < 26; i++) {
10            if (count[i] % 2 == 1) {
11                odd++;
12                middle = (char) ('a' + i);
13            }
14        }
15        if (odd > 1) return "";
16        int[] half = new int[26];
17        for (int i = 0; i < 26; i++) {
18            half[i] = count[i] / 2;
19        }
20        StringBuilder left = new StringBuilder();
21        for (int pos = 0; pos < s.length() / 2; pos++) {
22            boolean found = false;
23            for (int ch = 0; ch < 26; ch++) {
24                if (half[ch] == 0) continue;
25                half[ch]--;
26                left.append((char) ('a' + ch));
27                if (possible(left, half, middle, target)) {
28                    found = true;
29                    break;
30                }
31                left.deleteCharAt(left.length() - 1);
32                half[ch]++;
33            }
34            if (!found) return "";
35        }
36        String ans = palindrome(left.toString(), middle);
37        return ans.compareTo(target) > 0 ? ans : "";
38    }
39    private boolean possible(StringBuilder left, int[] half,
40                             char middle, String target) {
41        StringBuilder temp = new StringBuilder(left);
42        for (int i = 25; i >= 0; i--) {
43            for (int j = 0; j < half[i]; j++) {
44                temp.append((char) ('a' + i));
45            }
46        }
47        String largest = palindrome(temp.toString(), middle);
48        return largest.compareTo(target) > 0;
49    }
50    private String palindrome(String left, char middle) {
51        StringBuilder ans = new StringBuilder(left);
52        if (middle != 0) {
53            ans.append(middle);
54        }
55        ans.append(new StringBuilder(left).reverse());
56        return ans.toString();
57    }
58}