import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt(), turn = 0;

        while (turn < test_cases) {
            int size = sc.nextInt(), total_sum = 0;
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                total_sum += arr[i];
            }

            int alice = 0, bob = 0, alice_chocolate_high = 0, bob_chocolate_high = 0, alice_high_index = 0,
                    bob_high_index = 0;
            while (total_sum > 0) {
                if (total_sum % 2 == 0) {
                    // alice turn
                    for (int i = 0; i < size; i++) {
                        if (arr[i] >= alice_chocolate_high) {
                            alice_chocolate_high = arr[i];
                            alice_high_index = i;
                        }
                    }
                    if (alice_chocolate_high % 2 == 0 || alice_chocolate_high == 1) {
                        alice += alice_chocolate_high;
                        arr[alice_high_index] = 0;
                        total_sum -= alice_chocolate_high;
                    } else {
                        alice += alice_chocolate_high - 1;
                        arr[alice_high_index] = arr[alice_high_index] - alice_chocolate_high + 1;
                        total_sum -= alice_chocolate_high - 1;
                    }
                    alice_chocolate_high = 0;
                }

                else {
                    for (int i = 0; i < size; i++) {
                        if (arr[i] >= bob_chocolate_high) {
                            bob_chocolate_high = arr[i];
                            bob_high_index = i;
                        }
                    }
                    if (bob_chocolate_high % 2 == 0 || bob_chocolate_high == 1) {
                        bob += bob_chocolate_high;
                        arr[bob_high_index] = 0;
                        total_sum -= bob_chocolate_high;
                    } else {
                        bob += bob_chocolate_high - 1;
                        arr[bob_high_index] = arr[bob_high_index] - bob_chocolate_high + 1;
                        total_sum -= bob_chocolate_high - 1;
                    }
                    bob_chocolate_high = 0;
                }

            }
            System.out.println(alice);
            System.out.println(bob);
            turn++;
        }
        sc.close();
    }
}
