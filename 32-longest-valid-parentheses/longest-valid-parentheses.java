class Solution {
    public int longestValidParentheses(String s) {

        if (s.length() < 2) {
            return 0;
        }
        ArrayList<Integer> index = new ArrayList<>();
        Deque<Character> stack = new ArrayDeque<>();

        int ans = 0, prev = 0;
        // boolean space = false;
        stack.push(s.charAt(0));
        index.add(0);

        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(a);
                index.add(i);
                continue;
            }
            if (a == ')' && stack.peek() == '(') {
                stack.pop();
                if (!index.isEmpty()) {
                    index.remove(index.size() - 1);
                }
            } else {
                stack.push(a);
                index.add(i);
            }
        }

        if (index.isEmpty()) {
            return s.length();
        }

        // if(index.get(0) == 1){
        //     prev = -1;
        // }

        for (int i = 0; i < index.size(); i++) {

            ans = Math.max(ans, index.get(i) - prev);
            prev = index.get(i) + 1;
        }

        return (s.length() - index.get(index.size() - 1) - 1) > ans ? (s.length() - index.get(index.size() - 1) - 1)
                : ans;
    }
}