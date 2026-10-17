class Solution {
    public void check(int left, int curr, int right, ArrayList<Integer> pres, ArrayList<Integer> prev) {
        while (curr < 8) {
            if (curr == 0) {
                pres.set(0, 0);
            } else if (curr == 7) {
                pres.set(7, 0);
            } else {
                if (prev.get(left) == prev.get(right)) {
                    pres.set(curr, 1);
                } else {
                    pres.set(curr, 0);
                }
            }
            curr++;
            left++;
            right++;
        }
        return;
    }

    public int[] prisonAfterNDays(int[] c, int n) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();

        ArrayList<Integer> prev = new ArrayList<>(8);
        ArrayList<Integer> pres = new ArrayList<>(8);

        for (int i = 0; i < 8; i++) {
            pres.add(0);
        }

        for (int i : c) {
            prev.add(i);
        }

        int day = 1, left = -1, curr = 0, right = 1, last = 0;

        boolean found = false;

        while (!found) {
            check(left, curr, right, pres, prev);

            if (map.containsKey(pres)) {
                last = map.get(pres);
                found = true;
                break;
            }
            map.put(new ArrayList<>(pres), day);
            prev = new ArrayList<>(pres);
            day++;
            left = -1;
            curr = 0;
            right = 1;
        }

        prev = new ArrayList<>(pres);

        System.out.println("day = " + day);
        System.out.println("last = " + last);

        int rem = (n - last) % (day - last);
        System.out.println("rem = " + rem);

        int j = 0;

        while (j < rem) {
            System.out.println("j = " + (j + 1));
            check(left, curr, right, pres, prev);
            System.out.println("pres = " + pres);
            prev = new ArrayList<>(pres);
            left = -1;
            curr = 0;
            right = 1;
            j++;
        }

        int[] ans = new int[pres.size()];
        for (int i = 0; i < pres.size(); i++) {
            ans[i] = pres.get(i);
            System.out.println("i = " + i + " = " + ans[i]);
        }

        return ans;
    }
}