import java.util.HashMap;

public class romanToInteger {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        HashMap<Character, Integer> original =  new HashMap<>();
        original.put('I', 1);
        original.put('V', 5);
        original.put('X', 10);
        original.put('L', 50);
        original.put('C', 100);
        original.put('D', 500);
        original.put('M', 1000);

        // char []c = str.toCharArray();
        // System.out.println(c);
        int sum = 0;
        for(int i = 0; i < str.length() - 1; i++){
            char c = str.charAt(i);
            char d = str.charAt( i + 1);

            if(original.get(c) >= original.get(d)){
                sum += original.get(c);
            } else {
                sum += (-original.get(c));
            }
        }
        sum+= original.get(str.charAt(str.length() - 1));
        System.out.println(sum);
        }
    }
