public class Solution_MaxProTwoElement{
    public int maxPro(int []n){
        int max = 0, sec_max = 0;
        for (int i : n){
            if (i > max){
                sec_max = max;
                max = i;
            } else if (i > sec_max){
                sec_max = i;
            }
        }
        return (max-1)*(sec_max-1);
    }
}