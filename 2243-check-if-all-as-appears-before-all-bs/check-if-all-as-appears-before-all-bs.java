class Solution {
    public boolean checkString(String s) {
        boolean res = true, a = false, b = false;
        for(int i = 0; i< s.length(); i++){
            if(b == true && s.charAt(i) == 'a'){
                res = false;
                break;
            }

            if(s.charAt(i) == 'a'){
                a = true;
            }else{
                b = true;
            }
        }
        return res;
    }
}
