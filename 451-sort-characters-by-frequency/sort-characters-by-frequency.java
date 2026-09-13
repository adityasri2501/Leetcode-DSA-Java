class Solution {

    public String frequencySort(String g) {
        HashMap<String, Integer> map = new HashMap<>();

        String []str = g.trim().split("");
        for(String s : str){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }


        PriorityQueue<String> qu = new PriorityQueue<>((a,b) -> Integer.compare(map.get(b), map.get(a)));

        for(String s : map.keySet()){
            qu.add(s);
        }

        String ans= "";

        while(!qu.isEmpty()){
            String p = qu.poll();
            for(int i = 0; i< map.get(p); i++){
                ans += p;
            }
        }

        return ans;

    }
}