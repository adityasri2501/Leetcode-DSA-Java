class Solution {
    public int firstUniqChar(String s) {
        int [] un = new int[27];

        for(int i = 0; i < s.length(); i++){
            un[s.charAt(i) - 'a' + 1]++;
        }

        for(int i = 0; i < s.length(); i++){
            if(un[s.charAt(i) - 'a' + 1] == 1){
                return i;
            }
        }
        return -1;
    }
}