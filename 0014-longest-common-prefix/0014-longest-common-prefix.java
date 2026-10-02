class Solution {
    public String longestCommonPrefix(String[] str) {

        int i = 0, min_len = Integer.MAX_VALUE;
        StringBuilder res = new StringBuilder("");

        for(String s : str){
            if(s.length() < min_len){
                min_len = s.length();
            }
        }

        while(i < min_len){
            res.append(str[0].charAt(i));
            for(int k = 1; k < str.length; k++){
                if(res.charAt(i) == str[k].charAt(i)){
                    continue;
                } else{
                    return res.deleteCharAt(res.length() - 1).toString();
                }
            }
            i++;
        }

        return res.toString();
    }
}