class Solution {

    public void put(String s, HashMap<Character, Integer> map){
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        put(s, maps);
        put(t, mapt);

        System.out.println("maps = " + maps);
        System.out.println("mapt = " + mapt);

        if(maps.size() != mapt.size()){
            return false;
        }

        for(Character i : maps.keySet()){
            System.out.println("mapt.containsKey(i) = " + mapt.containsKey(i));
            System.out.println("maps.get(i) == mapt.get(i) = " + (!maps.get(i).equals(mapt.get(i))));
            System.out.println("maps.get(i) != mapt.get(i) = " + (!maps.get(i).equals(mapt.get(i))));
            if(!mapt.containsKey(i) || !maps.get(i).equals(mapt.get(i))){
                System.out.println("i = " + i);
                return false;
            }
        }

        return true;
    }
}