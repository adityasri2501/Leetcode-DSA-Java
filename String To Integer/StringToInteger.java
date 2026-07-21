class Solution_S {
    public int myAtoi(String s) {

        // BRUTE FORCE APPROACH


        // String str = s.trim(), num_str = "";
        // boolean num_app = false;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (Character.isDigit(ch)) {
        //         if (num_str.equals("-") || num_str.equals("+") || num_app == false) { // will be executed once and at start
        //             num_str += ch;
        //             num_app = true;
        //         } else {
        //             int a = Integer.parseInt(num_str); // present result string
        //             int b = Integer.parseInt(String.valueOf(ch)); // present char
        //             if ((a > Integer.MIN_VALUE / 10
        //                     && a < Integer.MAX_VALUE / 10)) { // checks the range
        //                 num_str += ch;
        //             } else {
        //                 if (num_str.startsWith("-")){
        //                     if (a == Integer.MIN_VALUE / 10 && b <= 8){
        //                         num_str += ch;
        //                     } else {
        //                         num_str  = String.valueOf(Integer.MIN_VALUE);
        //                         break;
        //                     }
        //                 } else if ((a == Integer.MAX_VALUE / 10 && b <= 7)){
        //                     num_str += ch;
        //                 } else {
        //                     num_str  = String.valueOf(Integer.MAX_VALUE);
        //                     break;
        //                 }
        //             }
        //         }
        //     } else if (num_str.isEmpty() && (ch == '-' || ch == '+')) {
        //         num_str += ch;
        //     } else {
        //         break;
        //     }
        // }
        // if (num_str.isEmpty() || num_str.equals("-") || num_str.equals("+")) {
        //     return 0;
        // } else {
        //     return Integer.parseInt(num_str);
        // }


        // EFFICIENT WAY

       String str = s.trim();
       int sign, num;
       final int def_min = Integer.MIN_VALUE, def_max = Integer.MAX_VALUE;
       for (char ch : str.toCharArray()){
        if (String.valueOf(ch).equals("-")){
            num = -1;
        } else if ( String.valueOf(ch).equals("+")){
            num = 1;
        } else {
            break;
        }
       }
    }
}

class StringToInteger {
    public static void main(String[] main) {
        Solution_S solution = new Solution_S();
        String str = "-21474836481234";
        int result = solution.myAtoi(str);
        System.out.println(result);
    }
}