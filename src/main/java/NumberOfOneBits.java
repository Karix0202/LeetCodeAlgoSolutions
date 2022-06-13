public class NumberOfOneBits {
    public int hammingWeight(int n) {
        String inBinary = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < inBinary.length(); i++) {
            if (inBinary.charAt(i) == '1') count++;
        }

        return count;
    }
}
