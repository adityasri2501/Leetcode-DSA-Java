class Solution {
    public int strStr(String h, String n) {

        if (n.length() > h.length()) {
            return -1;
        }

        int i = 0, j = 0, ans = -1;
        boolean once = true;

        System.out.println("ans = " + ans);
        while (i < h.length() && j < n.length()) {
            System.out.println("====================================================");
            System.out.println("i = " + h.charAt(i));
            System.out.println("j = " + n.charAt(j));
            if (h.charAt(i) == n.charAt(j)) {
                System.out.println("Found");
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
                System.out.println("Not Found");
            }
            System.out.println("ans = " + ans);
        }

        if(j < n.length()){
            return -1;
        }

        return ans;
    }
}