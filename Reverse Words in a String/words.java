import java.util.Arrays;

public class words {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String []str = s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);

        StringBuffer str_final = new StringBuffer();

        for(int i = str.length - 1; i >= 0; i--){
            str_final.append(str[i] + " ");
        }
        
        System.out.println(str_final.toString().trim());
    }
}
