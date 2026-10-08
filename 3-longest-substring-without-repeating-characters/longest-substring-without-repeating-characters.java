class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() < 2) {
            return s.length();
        }

        int prev = -1;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.isEmpty()) {
                set.add(s.charAt(i));
            } else {
                if (set.contains(s.charAt(i))) {
                    if (set.size() > prev) {
                        prev = set.size();
                    }
                    i -= set.size();
                    set.clear();
                } else {
                    set.add(s.charAt(i));
                }
            }
        }

        if (set.size() > prev) {
            prev = set.size();
        }

        return prev;
    }
}