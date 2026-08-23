import java.util.PriorityQueue;

class Element implements Comparable<Element>{

    Integer a;

    Element(int e){
        this.a = e;
    }

    @Override
    public int compareTo(Element other){
        return this.a.compareTo(other.a);
    }

}

public class largestElement {
    public static void main(String[] args) {
        int []nums = {3,2,1,5,6,4};
        int k = 2;

        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(int i = 0; i< nums.length; i++){
            Element e = new Element (nums[i]);
            pq.add(e);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int [] ans = new int[k];
        for(int i = 0; i< k; i++){
            Element e = pq.poll();
            ans[i] = e.a;
        }

        System.out.println(ans[0]);
    }
}
