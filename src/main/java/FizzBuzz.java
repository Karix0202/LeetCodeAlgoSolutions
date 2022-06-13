import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];

        for (int i = 1; i <= n; i++) {
            String ans;
            if (i % 3 == 0 && i % 5 == 0) {
                ans = "FizzBuzz";
            } else if (i % 3 == 0) {
                ans = "Fizz";
            } else if (i % 5 == 0) {
                ans = "Buzz";
            } else {
                ans = String.valueOf(i);
            }

            answer[i - 1] = ans;
        }

        return Arrays.asList(answer);
    }
}
