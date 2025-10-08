class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256]; // default 0; we'll store index+1 to differentiate
        for (int i = 0; i < 256; i++) lastIndex[i] = -1; // -1 means not seen

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (lastIndex[ch] >= start) {
                start = lastIndex[ch] + 1;
            }
            lastIndex[ch] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
