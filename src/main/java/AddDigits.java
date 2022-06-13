public class AddDigits {
    public int addDigits(int num) {
        String str = String.valueOf(num);

        while (str.length() >= 2) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - 48;
            }
            str = String.valueOf(sum);
        }

        return Integer.parseInt(str);
    }
}
