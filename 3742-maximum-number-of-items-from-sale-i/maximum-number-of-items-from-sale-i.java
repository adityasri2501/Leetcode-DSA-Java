// class Solution {

//     public int free(int val, int[][] items, int res) {

//         for (int i = 0; i < items.length; i++) {
//             System.out.println("Condition items[i][0] % items[val][0] == 0 " + (items[i][0] % items[val][0] == 0));
//             if (val != i && items[i][0] % items[val][0] == 0) {
//                 System.out.println("condition true");
//                 System.out.println("i = " + i);
//                 res++;
//                 System.out.println("res = " + res);
//             }
//         }

//         return res;

//     }

//     public int maximumSaleItems(int[][] items, int bud) {

//         if(items.length < 2){
//             if(items[0][1] > bud){
//                 return 0;
//             } else {
//                 return bud/items[0][1];
//             }
//         }
//         Arrays.sort(items, Comparator.comparingInt(row -> row[1]));
//         int res = 0;

//         for(int i = 0; i< items.length && bud > 0; i++){
//             System.out.println("Condition bud / items[i][1] = " + bud / items[i][1]);
//             if(bud / items[i][1] > 0){
//                 System.out.println("Inside if");
//                 System.out.println("bud = " + bud);
//                 System.out.println("res = " + res);
//                 res += (bud / items[i][1]);
//                 bud -= ((bud / items[i][1])* items[i][1]);
//                 System.out.println("Before free");
//                 System.out.println("bud = " + bud);
//                 System.out.println("res = " + res);
//                 res = free(i, items, res);
//                 System.out.println("After free");
//                 System.out.println("bud = " + bud);
//                 System.out.println("res = " + res);
//                 System.out.println("===================================================================");
//             } else {
//                 break;
//             }
//         }

//         return res;
//         // for (int i = 0; i < items.length; i++) {
//         //     for (int j = 0; j < items[i].length; j++) {
//         //         System.out.println("Items [" + i + "][" + j + "] = " + items[i][j]);
//         //     }
//         //     System.out.println();
//         // }

//         // int[] quant = new int[items.length];


//         // for (int j = 0; j < quant.length; j++) {
//         //     System.out.println("Quant [" + j + "] = " + quant[j]);
//         // }

//         // for (int i = 0; i < quant.length; i++) {
//         //     for (int j = 0; j < quant.length; j++) {
//         //         System.out.println("quant[" + i + "] = " + quant[i]);
//         //         if (i != j && quant[i] > 0 && items[j][0] % items[i][0] == 0) {
//         //             System.out.println("Free");
//         //             System.out.println("j = " + items[j][0]);
//         //             System.out.println("i = " + items[i][0]);
//         //             quant[i]++;
//         //             System.out.println("quant[" + i + "] = " + quant[i]);
//         //         }
//         //         System.out.println("==================================================================");
//         //     }
//         // }
//         // for (int j = 0; j < quant.length; j++) {
//         //     System.out.println("Quant [" + j + "] = " + quant[j]);
//         // }

//         // System.out.println("==================================================================");

//         // for (int i : quant) {
//         //     System.out.println("i = " + i);
//         //     if (i > 0) {
//         //         res += i;
//         //     }
//         // }

//     }
// }

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] bonus = new int[n];

        // Precompute how many other items j != i have factor_j divisible by factor_i
        for (int i = 0; i < n; i++) {
            int fi = items[i][0];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % fi == 0) {
                    cnt++;
                }
            }
            bonus[i] = cnt;
        }

        // dp[b] = max total item copies (purchased + free) achievable using budget b
        int[] dp = new int[budget + 1];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int cost = items[i][1];
            if (cost > budget) {
                continue;
            }

            // 1) First copy of item i: costs `cost`, gives 1 + bonus[i] copies (at most once)
            int[] nextDp = dp.clone();
            int firstGain = 1 + bonus[i];
            for (int b = cost; b <= budget; b++) {
                if (dp[b - cost] + firstGain > nextDp[b]) {
                    nextDp[b] = dp[b - cost] + firstGain;
                }
            }

            // 2) Additional copies of item i: each costs `cost`, gives +1 copy (unbounded)
            for (int b = cost; b <= budget; b++) {
                if (nextDp[b - cost] + 1 > nextDp[b]) {
                    nextDp[b] = nextDp[b - cost] + 1;
                }
            }

            dp = nextDp;
        }

        for (int b = 0; b <= budget; b++) {
            if (dp[b] > ans) {
                ans = dp[b];
            }
        }
        return ans;
    }
}