1  class Solution {
2      public boolean validPalindrome(String s) {
3          if (s == null) return true;
4          int i = 0, j = s.length() - 1;
5
6          while (i < j) {
7              if (s.charAt(i) == s.charAt(j)) {
8                  i++;
9                  j--;
10             } else {
11                 return isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1);
12             }
13         }
14         return true;
15     }
16
17     private boolean isPalindromeRange(String s, int left, int right) {
18         while (left < right) {
19             if (s.charAt(left) != s.charAt(right)) return false;
20             left++;
21             right--;
22         }
23         return true;
24     }
25 }
