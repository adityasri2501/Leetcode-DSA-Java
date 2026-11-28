// class Solution {
//     public int maximumSaleItems(int[][] items, int budget) {

//         int [][] free = new int[items.length][items[0].length];

//         for (int i = 0; i < items.length; i++) {
//             free[i][0] = i;
//             for (int j = 0; j < items.length; j++) {
//                 // System.out.println("items[" + j + "][0] % items[" + i + "][0] == 0 => " + (items[j][0] % items[i][0] == 0));
//                 if (j != i && items[j][0] % items[i][0] == 0) {
//                     // System.out.println("Inside free");
//                     free[i][1]++;
//                     // System.out.println("free[" + i + "][1] = " + free[i][1]);
//                 }
//                 // System.out.print("free[" + i + "][0] => " + (free[i][0]));
//                 // System.out.println(" free[" + i + "][1] => " + (free[i][1]));
//             }
//             // System.out.println("================================================================================================");
//         }

//         Arrays.sort(free, Comparator.comparingInt((int []row) -> row[1]).reversed());

//         for (int i = 0; i < free.length; i++) {
//             for (int j = 0; j < free[i].length; j++) {
//                 System.out.println("free [" + i + "][" + j + "] = " + free[i][j]);
//             }
//             System.out.println();
//         }
        
//         return 1;
//     }
// }



class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        // Step 1: Frequency of each factor
        int[] freq = new int[n + 1];

        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            freq[item[0]]++;
            minPrice = Math.min(minPrice, item[1]);
        }

        // Step 2: Count eligible item types for each factor
        int[] divisibleCount = new int[n + 1];

        for (int f = 1; f <= n; f++) {

            for (int j = f; j <= n; j += f) {
                divisibleCount[f] += freq[j];
            }

            // Exclude the item itself
            divisibleCount[f]--;
        }

        // Step 3: Store [price, freeCount]
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = items[i][1];
            arr[i][1] = divisibleCount[items[i][0]];
        }

        // Step 4: Sort by price
        Arrays.sort(arr, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        // Step 5: Buy useful double-value copies
        long remaining = budget;
        long bundles = 0;

        for (int[] item : arr) {

            int price = item[0];
            int freeCount = item[1];

            if (price > 2L * minPrice) {
                break;
            }

            long canBuy = Math.min(
                freeCount,
                remaining / price
            );

            bundles += canBuy;
            remaining -= canBuy * price;

            if (canBuy < freeCount) {
                break;
            }
        }

        // Step 6: Spend remaining budget on cheapest item
        long singles = remaining / minPrice;

        long answer = 2 * bundles + singles;

        return (int) answer;
    }
}
