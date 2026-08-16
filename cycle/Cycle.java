// import java.util.Arrays;

// public class Cycle {
//     int []arr = { 4, 8, 1, 3, 12, 7 };
//     int n = arr.length;
//     for(int i = n - 1;i>=0;i--)
//     {
//         int temp = arr[0];
//         for (int j = 1; j < n; j++) {
//             // if (j == n - 1) {
//             // arr[n - j - 1] = temp;
//             // } else {
//             // arr[n - j - 1] = arr[n - j - 2];
//             // }
//             int tmp1 = arr[j];
//             arr[j] = temp;
//             temp = tmp1;
//         }
//         arr[0] = temp;
//         System.out.println(Arrays.toString(arr));
//     }

// }