//B. Enter Roman Number as input and convert it to integer. (ex IX = 9)
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number in capital letter: ");
        String roman = scanner.nextLine();
        int result = romanToInteger(roman);
        
        if (result == -1) {
            System.out.println("Invalid Roman numeral.");
        } else {
            System.out.println("Integer value of given roman number is: " + result);
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.getOrDefault(s.charAt(i), 0);

            if (currentValue == 0) {
                // Invalid Roman numeral character
                return -1;
            }

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}

