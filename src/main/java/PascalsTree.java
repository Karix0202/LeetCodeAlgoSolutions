import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTree {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));

        if (numRows == 1) return triangle;
        triangle.add(Arrays.asList(1, 1));

        for (int i = 2; i < numRows; i++) {
            List<Integer> lastRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);
            for (int j = 1; j < lastRow.size(); j++) {
                newRow.add(lastRow.get(j - 1) + lastRow.get(j));
            }
            newRow.add(1);
            triangle.add(newRow);
        }

        return triangle;
    }
}
