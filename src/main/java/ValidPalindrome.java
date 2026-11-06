public class ValidPalindrome {
    public boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("\\s+|[^a-z0-9]", "");
//        return new StringBuilder(s.substring(0, s.length() / 2))
//                .reverse()
//                .toString()
//                .equals(s.substring((s.length() + 1) / 2));

        s = s.toLowerCase().replaceAll("\\s+|[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while (left < right) {
            System.out.println(charArray[left]);
            System.out.println(charArray[right]);

            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
