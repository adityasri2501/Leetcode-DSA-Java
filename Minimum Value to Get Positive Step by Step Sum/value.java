public class value {
    public static void main(String[] args) {
        int []arr = {2,3,5,-5,-1};
        int low = 1, sum = 0;
        for(int i : arr){
            sum += Math.abs(i);
        }

        System.out.println(low);
        int high = sum, mid = 0, step_sum = 0, prev = 0;
        System.out.println(high);

        boolean step_sum_done = false, prev_count = false, mid_count = false;
        while(low<=high){
            step_sum_done = false;
            mid = Math.floorDiv(low+high, 2);
            step_sum = mid;
            // System.out.println(mid);
            for(int i = 0; i < arr.length; i++){
                // System.out.println(step_sum);
                if(step_sum + arr[i] >= 1){
                    step_sum += arr[i];
                    step_sum_done = true;
                } else {
                    step_sum_done = false;
                    break;
                }
            }

            if (step_sum_done) {
                prev = mid;
                high = mid - 1;
                prev_count = true;
                mid_count = true;
            } else {
                low = mid + 1;
                mid_count= false;
            }
        }
        if(mid_count){
            System.out.println(mid);
        } else {
            System.out.println(prev);
        }
    }
}
