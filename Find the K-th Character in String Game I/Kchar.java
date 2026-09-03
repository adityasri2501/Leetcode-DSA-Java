public class Kchar {
    public char find(StringBuffer str, int k) {
        if (str.length() >= k) {
            return str.charAt(k - 1);
        }

        int size = str.length();
        for (int i = 0; i < size; i++) {
            char c = str.charAt(i);
            if (c == 'z') {
                str.append("a");
            } else {
                // str.append(((char) (((int) str.charAt(i)) + 1)));

                str.append(++c);
            }
        }

        return find(str, k);
    }

    public char kthCharacter(int k) {
        // str.append("a");
        // while(str.length() < k){
        //     int size = str.length();
        //     for(int i = 0; i< size; i++){
        //         char c = str.charAt(i);
        //         if(c == 'z'){
        //             str.append("a");
        //         } else{
        //         str.append(((char) (((int) str.charAt(i)) + 1)));

        //         // str.append(++c);
        //         }

        //     }
        //     // System.out.println(str);
        // }
        // return str.charAt(k-1);

        StringBuffer str = new StringBuffer();
        str.append("a");

        return find(str, k);
    }
}