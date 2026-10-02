class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");

        // for (String a : str) {
        //     System.out.println(a);
        // }

        return str[str.length - 1].length();

        // return -1;
    }
}