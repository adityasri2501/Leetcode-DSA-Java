public class eating {
    public static void main(String[] args) {
        int[] piles = {312884469};
        int h = 312884469, max = piles[0];
        
        for(int i: piles){
            max = Math.max(max,i);
        }

        int low = 1, high = max, mid = 0;
        long count = 0;

        while(low <= high){
            mid = Math.floorDiv(low+high, 2);
            count = 0;
            for(int i = 0; i< piles.length; i++){
                if(piles[i] <= mid){
                    count++;
                } else {
                    if(piles[i]%mid == 0){
                        count += piles[i]/(long)mid;
                    } else {
                        count += piles[i]/(long)mid + 1;
                    }
                }
            }
            if(count <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println((low));
    }
}
