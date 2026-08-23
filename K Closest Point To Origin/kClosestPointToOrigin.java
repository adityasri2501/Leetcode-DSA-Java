import java.util.PriorityQueue;

class Point implements Comparable<Point>{
    Integer x, y, dist;
    Point(Integer x, Integer y){
        this.x = x;
        this.y = y;
        this.dist = x*x  + y*y;
    }


    @Override
    public int compareTo(Point other){
        return other.dist.compareTo(this.dist);
    }

    @Override
    public String toString(){
        return ("[" + x+ "," + y + "]");
    }
}

public class kClosestPointToOrigin {


    public static void main(String[] args) {
        int [][]arr = {
            {1,3},
            {-2,2}
        };

        PriorityQueue<Point> pq = new PriorityQueue<>();

        int k = 1;
        for(int i = 0; i<arr.length; i++){
            Point p = new Point(arr[i][0], arr[i][1]);
            pq.add(p);
            if(pq.size() > k){
                pq.poll();
            }
        }
        System.out.println(pq);
        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point p = pq.poll();

            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        System.out.println(ans);
    }
}
