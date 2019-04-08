import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbols = new HashMap<Character, Integer>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int previous = symbols.get(s.charAt(0));
        if (s.length() == 1) return previous;

        int next = 0;
        int sum = 0;

        for (int i = 1; i < s.length(); i++) {
            next = symbols.get(s.charAt(i));
            if (previous < next) {
                previous = next - previous;
            } else {
                sum += previous;
                previous = next;
            }
        }
        sum += previous;
        return sum;
    }
}
