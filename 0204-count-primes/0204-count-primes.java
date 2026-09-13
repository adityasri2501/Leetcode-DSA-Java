class Solution {
    public int countPrimes(int n) {
        boolean[] visited = new boolean[n];

        for (int i = 2; i * i < n; i++) {

            if (!visited[i]) {

                for (int j = i * i; j < n; j += i) {
                    visited[j] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!visited[i]) {
                count++;
            }
        }

        return count;

    }
}