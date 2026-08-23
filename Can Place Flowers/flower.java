public class flower {
    public static void main(String[] args) {
        int[] F = { 1, 0, 0, 0, 1 };
        int m = 1;
        int n = F.length;

        if (n == 1) {
            if (F[0] == 0)
                System.out.println(true);
            else {
                if (m > 0)
                    System.out.println(false);
                else
                    System.out.println(true);
            }
        }

        int ans = 0;

        if (F[0] == 1 && F[n - 1] == 1) {
            for (int i = 2; i < n - 1; ++i) {
                if (F[i] == 0 && F[i + 1] == 0 && F[i - 1] == 0) {
                    F[i] = 1;
                    ans++;
                }
            }

            if (F[n - 2] == 0 && F[n - 1] == 0)
                ++ans;

        } else if (F[0] == 0 && F[n - 1] == 1) {
            if (F[1] == 0) {
                F[0] = 1;
                ans++;
            }

            for (int i = 1; i < n - 1; ++i) {
                if (F[i] == 0 && F[i + 1] == 0 && F[i - 1] == 0) {
                    F[i] = 1;
                    ans++;
                }
            }

        } else if (F[0] == 1 && F[n - 1] == 0) {
            for (int i = 1; i < n - 1; ++i) {
                if (F[i] == 0 && F[i + 1] == 0 && F[i - 1] == 0) {
                    F[i] = 1;
                    ans++;
                }
            }

            if (F[n - 2] == 0 && F[n - 1] == 0)
                ++ans;
        } else {

            if (F[1] == 0) {
                F[0] = 1;
                ans++;
            }

            for (int i = 1; i < n - 1; ++i) {
                if (F[i] == 0 && F[i + 1] == 0 && F[i - 1] == 0) {
                    F[i] = 1;
                    ans++;
                }
            }

            if (F[n - 2] == 0 && F[n - 1] == 0)
                ++ans;
        }

        if (ans >= m) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}