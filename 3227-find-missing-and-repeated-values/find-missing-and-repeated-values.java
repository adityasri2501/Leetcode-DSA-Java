class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int[] in = new int[(arr.length * arr[0].length) + 1];
        int[] res = new int[2];

        int a = -1, b = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (-in[arr[i][j]] == arr[i][j]) {
                    a = arr[i][j];
                    System.out.println("A found -> " + a);
                } else {
                    in[arr[i][j]] = -arr[i][j];
                }
            }
        }

        for (int i = 0; i < in.length; i++) {
            System.out.println(i + " -> " + in[i]);
        }
        System.out.println("===============================================================");

        // int a = 0, b = 0;
        boolean findb = false;

        // finda = false, 

        for (int i = 0; i < in.length; i++) {
            System.out.println(i + " -> " + in[i]);
            // if (in[i] > 0 && finda == false) {
            //     a = in[i];
            //     finda = true;
            //     System.out.println("A found -> " + a + " => in[" + i + "] -> " + in[i]);
            // }
            if (i != -in[i] && findb == false) {
                b = i;
                findb = true;
                System.out.println("B found -> " + b + " => in[" + i + "] -> " + -in[i]);
                break;
            }

            // if (finda && findb) {
            //     break;
            // }

        }

        res[0] = a;
        res[1] = b;

        return res;
    }
}