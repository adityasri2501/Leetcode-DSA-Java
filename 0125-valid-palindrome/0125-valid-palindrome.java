class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (((int) (s.charAt(i)) >= 65 && (int) (s.charAt(i)) <= 90) || ((int) (s.charAt(i)) >= 97
                    && (int) (s.charAt(i)) <= 122)
                    || ((int) (s.charAt(i)) >= 48
                            && (int) (s.charAt(i)) <= 57)) {
                str += Character.toLowerCase(s.charAt(i));
            }
        }

        System.out.println(str);

        int low = 0, high = str.length() - 1;
        while (low <= high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }

        return true;
    }
}