class Solution {

    public String check(int left, int right, String s, boolean even, int present) {

        StringBuilder res = new StringBuilder("");
        if (!even) {
            res = new StringBuilder(String.valueOf(s.charAt(present)));
        }
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                res.insert(0, s.charAt(left));
                res.insert(res.length(), s.charAt(right));
                left--;
                right++;
            } else {
                break;
            }
        }
        return res.toString();
    }

    public String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        StringBuilder ans = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;

            // even
            StringBuilder even = new StringBuilder(check(i, i + 1, s, true, i));

            // odd
            StringBuilder odd = new StringBuilder(check(i - 1, i + 1, s, false, i));

            if (even.length() > odd.length()) {
                if (even.length() > ans.length()) {
                    ans = new StringBuilder(even);
                }
            } else {
                if (odd.length() > ans.length()) {
                    ans = new StringBuilder(odd);
                }
            }

        }

        if (ans.length() == 0) {
            return String.valueOf(s.charAt(0));
        }

        return ans.toString();
    }
}