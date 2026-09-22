class Solution {
    public int hammingWeight(int n) {
        String str[] = Integer.toBinaryString(n).trim().split("");

        int count = 0;
        for(String s : str){
            if(s.equals("1")){
                count++;
            }
        }
        return count;
    }
}