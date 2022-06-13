import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < m && j < n) {
            int num;

            if (nums1[i] <= nums2[j]) {
                num = nums1[i];
                i++;
            } else {
                num = nums2[j];
                j++;
            }

            list.add(num);
        }

        if (i != m) {
            for (int k = i; k < m; k++) {
                list.add(nums1[k]);
            }
        }
        if (j != n) {
            for (int k = j; k < n; k++) {
                list.add(nums2[k]);
            }
        }

        for (int k = 0; k < list.size(); k++) {
            nums1[k] = list.get(k);
        }
    }
}
