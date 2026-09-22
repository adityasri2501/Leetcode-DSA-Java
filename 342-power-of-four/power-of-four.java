class Solution {
    public boolean isPowerOfFour(int n) {
        if((n < 0 || n < 4) && n != 1){
            return false;
        }
        String str[] = Integer.toBinaryString(n).trim().split("");
        if((!(str[0].equals("1"))) || str.length % 2 == 0){
            return false;
        }

        for(int i = 1; i< str.length; i++){
            if(str[i].equals("1")){
                return false;
            }
        }

        return true;
    }
}