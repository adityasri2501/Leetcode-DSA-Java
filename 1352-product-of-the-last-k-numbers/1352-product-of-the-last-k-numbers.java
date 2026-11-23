class ProductOfNumbers {

    ArrayList<Integer> list = new ArrayList<>();
    // int prev = 1, zero = -1;
    
    public ProductOfNumbers() {

    }
    
    public void add(int num) {
        // prev *= num;
        // list.add(prev);
        // if(num == 0){
        //     zero = list.size() - 1;
        // }
        list.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1, j = 0;
        for(int i = list.size() - 1; i >= 0 && j < k; j++, i--){
            prod *= list.get(i);
        }
        // return (list.get(list.size() - 1) / list.get(list.size() - k - 1));
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */