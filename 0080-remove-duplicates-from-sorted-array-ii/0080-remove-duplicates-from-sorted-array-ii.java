class Solution {
    public int removeDuplicates(int[] arr) {
        // 1 1 1 2 2 3
        // 0 1 2 3 4 5
        int count = 1, num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (num == arr[i]) {
                if (count < 2) {
                    count++;
                } else {
                    arr[i] = 100000;
                }
            } else {
                num = arr[i];
                count = 1;
            }
        }

        count = 0;

        Arrays.sort(arr);

        for (int i : arr) {
            if(i != 100000){
                count++;
            }
            // System.out.print(i + ", ");
        }

        return count;
    }
}