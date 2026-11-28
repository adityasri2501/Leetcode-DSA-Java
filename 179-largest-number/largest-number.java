class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        StringBuilder ans = new StringBuilder();

        for(String s : arr){
            ans.append(s);
        }

        // long res = Long.parseLong(ans.toString());

        for(int i = 0; i < ans.length(); i++){
            System.out.println("ans.charAt(" + i + ") = " + ans.charAt(i));
            if(ans.charAt(i) == '0' && i + 1 != ans.length()){
                ans.deleteCharAt(0);
                i--;
            } else{
                break;
            }
        }

        return ans.toString();
    }
}