class Solution {
    public String removeStars(String s) {
        int j = 0;

        StringBuilder res = new StringBuilder("");

        while (j < s.length()) {
            if (s.charAt(j) == '*') {
                if (res.length() > 0) {
                    res.setLength(res.length() - 1);
                }
            } else {
                res.append(s.charAt(j));
            }
            j++;
        }

        return res.toString();

    }
}