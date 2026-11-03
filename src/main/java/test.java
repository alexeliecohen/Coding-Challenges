import java.util.*;

public class test {
    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            map.computeIfAbsent(sortAlphabetically(str), k -> new ArrayList<>()).add(str);
        }
        return map.values().stream().toList();
    }

    public static String sortAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }


}


