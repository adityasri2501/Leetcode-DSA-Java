class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        int[] in = new int[(arr.length * arr[0].length) + 1];
        int[] res = new int[2];

        int a = -1, b = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (-in[arr[i][j]] == arr[i][j]) {
                    a = arr[i][j];
                    // System.out.println("A found -> " + a);
                } else {
                    in[arr[i][j]] = -arr[i][j];
                }
            }
        }
        boolean findb = false;

        for (int i = 0; i < in.length; i++) {
            if (i != -in[i]) {
                b = i;
                findb = true;
                break;
            }

        }

        res[0] = a;
        res[1] = b;

        return res;
    }
}