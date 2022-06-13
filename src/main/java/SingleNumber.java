import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // num, count

        for (int num : nums) {
            map.computeIfPresent(num, (key, val) -> val + 1);
            map.putIfAbsent(num, 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }


        return 1;
    }
}
