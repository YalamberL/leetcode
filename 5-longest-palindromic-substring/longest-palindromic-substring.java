class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int resLen = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int l = i, r = i;

            while (l >= 0 && r < s.length()
                    && s.charAt(l) == s.charAt(r)) {

                if ((r - l + 1) > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }

                l--;
                r++;
            }

            // Even-length palindrome
            int l2 = i, r2 = i + 1;

            while (l2 >= 0 && r2 < s.length()
                    && s.charAt(l2) == s.charAt(r2)) {

                if ((r2 - l2 + 1) > resLen) {
                    res = s.substring(l2, r2 + 1);
                    resLen = r2 - l2 + 1;
                }

                l2--;
                r2++;
            }
        }

        return res;
    }
}