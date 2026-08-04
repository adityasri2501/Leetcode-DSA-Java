import java.util.HashSet;

class Solution_CD{
    public boolean containsDuplicates(int []nums){
        HashSet <Integer> set = new HashSet<>();
        for (int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}