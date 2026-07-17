class Solution_P {
    public boolean isPalindrome(int x) {
        // String str1 = String.valueOf(x);
        // int len = str1.length();
        // if (len%2==0){
        //     // for even length
        //     String s1 = str1.substring(0, len/2);
        //     String s2 = new StringBuffer(str1.substring(len/2)).reverse().toString(); // converting back to string
        //     if (s1.equals(s2)){
        //         return true;
        //     }
        // } else {
        //     // here mid element is one element so making it neutral and will depend on sliced part
        //     String s1 = str1.substring(0, len/2);
        //     String s2 = new StringBuffer(str1.substring((len/2) + 1)).reverse().toString();
        //     if (s1.equals(s2)){
        //         return true;
        //     }
        // }
        // return false;
        if (x < 0){
            return false;
        }
        int rev = 0;
        int org = x;
        while (org> 0){
            int rem = org % 10;
            org = org / 10;
            rev = rev*10 + rem;
        }
        return (x == rev);
    }
}

public class palindrome {
    public static void main(String[] args) {
        Solution_P solution = new Solution_P();
        int x = 121;
        boolean result = solution.isPalindrome(x);
        System.out.println(result);
    }
}
