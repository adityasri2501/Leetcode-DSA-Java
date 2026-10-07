class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> ran = new HashMap<>();
        HashMap<Character, Integer> mag = new HashMap<>();

        for (int i = 0; i < m.length(); i++) {
            mag.put(m.charAt(i), mag.getOrDefault(m.charAt(i), 0) + 1);
        }

        for (int i = 0; i < r.length(); i++) {
            ran.put(r.charAt(i), ran.getOrDefault(r.charAt(i), 0) + 1);
        }

        // System.out.println("----- mag ----- " + mag);
        // System.out.println("----- ran ----- " + ran);

        for (Character s : ran.keySet()) {
            // if(ran.get(s) == mag.get(s)){
            //     continue;
            // } else {
            //     return false;
            // }
            // System.out.println("----- s ----- " + s + " --- ran count = " + ran.get(s));
            // System.out.println("----- s ----- " + s + " --- mag count = " + mag.get(s));
            if (mag.containsKey(s)) {

                if (!(ran.get(s) <= mag.get(s))) {
                    // System.out.println("----- in if ----- ");
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}