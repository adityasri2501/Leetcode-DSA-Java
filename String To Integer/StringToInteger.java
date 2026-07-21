class Solution_S {
    public int myAtoi(String s) {

        // BRUTE FORCE APPROACH

        String str = s.trim(), num_str = "";
        boolean num_app = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (num_str.equals("-") || num_str.equals("+") || num_app == false) { // will be executed once and at
                                                                                      // start
                    num_str += ch;
                    num_app = true;
                } else {
                    int a = Integer.parseInt(num_str); // present result string
                    int b = Integer.parseInt(String.valueOf(ch)); // present char
                    if ((a > Integer.MIN_VALUE / 10
                            && a < Integer.MAX_VALUE / 10)) { // checks the range
                        num_str += ch;
                    } else {
                        if (num_str.startsWith("-")) {
                            if (a == Integer.MIN_VALUE / 10 && b <= 8) {
                                num_str += ch;
                            } else {
                                num_str = String.valueOf(Integer.MIN_VALUE);
                                break;
                            }
                        } else if ((a == Integer.MAX_VALUE / 10 && b <= 7)) {
                            num_str += ch;
                        } else {
                            num_str = String.valueOf(Integer.MAX_VALUE);
                            break;
                        }
                    }
                }
            } else if (num_str.isEmpty() && (ch == '-' || ch == '+')) {
                num_str += ch;
            } else {
                break;
            }
        }
        if (num_str.isEmpty() || num_str.equals("-") || num_str.equals("+")) {
            return 0;
        } else {
            return Integer.parseInt(num_str);
        }

        // EFFICIENT WAY ("-2147483648" will fail below)

        // String str = s.trim();
        // int sign = 1, num = 0;
        // final int def_min = Integer.MIN_VALUE, def_max = Integer.MAX_VALUE;
        // boolean sign_app = false;
        // for (char ch : str.toCharArray()) {
        //     String present = String.valueOf(ch);
        //     if (Character.isDigit(ch)) {
        //         int digit = ch - '0'; // or Integer.parseInt(present)
        //         sign_app = true;
        //         if (num > def_min / 10 && num < def_max / 10) {
        //             num = num * 10 + digit;
        //         } else {
        //             if (sign == -1) {
        //                 if (num == def_min / 10 && digit <= 8) {
        //                     num = num * 10 + digit;
        //                 } else {
        //                     return def_min;
        //                 }
        //             } else {
        //                 if (num == def_max / 10 && digit <= 7) {
        //                     num = num * 10 + digit;
        //                 } else {
        //                     return def_max;
        //                 }
        //             }
        //         }
        //     } else if (sign_app == false) {
        //         sign_app = true;
        //         if (present.equals("-")) {
        //             sign = -1;
        //         } else if (present.equals("+")) {
        //             sign = 1;
        //         } else {
        //             break;
        //         }
        //     } else {
        //         break;
        //     }
        // }
        // if (sign == 1) {
        //     return num * sign;
        // } else {
        //     return num * sign;
        // }
    }
}