public class sqrtx {
    public static void main(String[] args) {
        long x = 2147395599;
        long low = 1, high = x, mid = Math.floorDiv(low+high, 2), ans = 0, closest = 0;
        boolean ans_found = false;
        while(low<=high){
            mid = Math.floorDiv(low+high, 2);
            if(mid*mid == x){
                ans = mid;
                ans_found = true;
                break;
            } else if(mid*mid < x){
                closest = mid;
                low = mid +1;
            }else if(mid*mid > x){
                high = mid - 1;
            }
        }
        if(ans_found){
            System.out.println((int) ans);
        } else {
            System.out.println((int) closest);
        }
    }
}
