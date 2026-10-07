class Solution {

    // public boolean sub(int curr, int dest, String []str, String s, String val, boolean found) {

    //     if (curr > dest) {

    //         return s.equals(val);
    //     }

    //     val += str[curr];
    //     found = sub(curr + 1, dest, str, s, val, found);

    //     if(found){
    //         return true;
    //     }

    //     if (val.length() > 0) {
    //         val = val.substring(0, val.length() - 1);
    //     }
    //     found = sub(curr + 1, dest, str, s, val, found);

    //     return found;
    // }

    public boolean isSubsequence(String s, String t) {
        // String[] str = t.split("");
        // return sub(0, str.length - 1, str, s, "", false);

        if(t.length() < 0 || s.length() > t.length()){
            return false;
        }

        int i = 0, j = 0;
        boolean ans = true;

        while(i < s.length() && j < t.length()){

            // System.out.println("i = " + i + " j = " + j + " found = " + ans);
            ans = false;
            char target = s.charAt(i);
            char pre = t.charAt(j);

            if(pre == target){
                // System.out.println(target + " found ");
                ans = true;
                i++;
            }
            j++;
                // System.out.println("end = " + "i = " + i + " j = " + j);
        }

        if(i <= s.length() - 1){
            ans = false;
        }

        return ans;
    }
}