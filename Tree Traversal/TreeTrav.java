import java.util.ArrayList;

class Node {
    int val;
    ArrayList<Node> child;

    Node(int val) {
        this.val = val;
        this.child = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "[Data: " + this.val + " ]";
    }
}

public class TreeTrav {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(8);
        Node n5 = new Node(4);
        Node n6 = new Node(7);
        Node n7 = new Node(9);
        Node n8 = new Node(13);
        Node n9 = new Node(14);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(5);
        Node n14 = new Node(15);
        Node n15 = new Node(6);

        ArrayList<Node> arr = new ArrayList<>();

        arr.add(n1);


        ArrayList<Node> arr1 = new ArrayList<>();
        arr1.add(n2);
        arr1.add(n3);
        arr1.add(n4);
        
        n1.child = arr1;
        
        ArrayList<Node> arr2 = new ArrayList<>();
        arr2.add(n5);
        arr2.add(n6);
        arr2.add(n7);
        
        n4.child = arr2;
        
        ArrayList<Node> arr3 = new ArrayList<>();
        arr3.add(n8);
        arr3.add(n9);
        arr3.add(n10);
        arr3.add(n11);
        
        n5.child = arr3;
        
        ArrayList<Node> arr4 = new ArrayList<>();
        arr4.add(n12);
        
        n10.child = arr4;
        
        ArrayList<Node> arr5 = new ArrayList<>();
        arr5.add(n13);
        arr5.add(n14);
        
        n12.child = arr5;

        ArrayList<Node> arr6 = new ArrayList<>();
        arr6.add(n15);
        
        n14.child = arr6;



        System.out.println(n1.val + " : " + n1.child.toString());
        System.out.println(n4.val + " : " + n4.child.toString());
        System.out.println(n5.val + " : " + n5.child.toString());
        System.out.println(n10.val + " : " + n10.child.toString());
        System.out.println(n12.val + " : " + n12.child.toString());
        System.out.println(n14.val + " : " + n14.child.toString());
    }
}
