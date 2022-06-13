public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        /*
         It's number system with base 26
         We must take into account that the exponent of 26 is increasing while moving to the right (not like in a decimal system - increasing while moving to the left)

         'A' - 64 = 1
         'B' - 64 = 2
         and so on...
        */

        int nmb = 0;

        int k = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            int j = ((int) columnTitle.charAt(i)) - 64;
            nmb += j * ((int) Math.pow(26, k));
            k -= 1;
        }

        return nmb;
    }
}
