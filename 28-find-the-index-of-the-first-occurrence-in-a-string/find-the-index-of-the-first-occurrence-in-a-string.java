class Solution {
    public int strStr(String h, String n) {

        if (n.length() > h.length()) {
            return -1;
        }

        int i = 0, j = 0, ans = -1;
        boolean once = true;

        while (i < h.length() && j < n.length()) {
            if (h.charAt(i) == n.charAt(j)) {
                if (once) {
                    ans = i;
                    once = false;
                }
                i++;
                j++;
            } else {
                if (!once) {
                    i = ans + 1;
                } else {
                    i++;
                }
                j = 0;
                ans = -1;
                once = true;
            }
        }

        if(j < n.length()){
            return -1;
        }

        return ans;
    }
}