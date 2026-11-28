class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    res.add("FizzBuzz");
                } else {
                    res.add("Fizz");
                }
            } else if(i % 5 == 0){
                res.add("Buzz");
            } else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}