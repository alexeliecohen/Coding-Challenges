import java.util.Arrays;
import java.util.List;

public class EncodingString {
    public static void main(String[] args) {
        EncodingString encodingString = new EncodingString();
        String encode = encodingString.encode(List.of("", ""));
        System.out.println(encode);
        System.out.println(Arrays.stream(encode.split("\\d+#")).count());
        System.out.println(Arrays.toString(encode.split("\\d+#")));
//        System.out.println(encodingString.decode(encode));
    }

    public String encode(List<String> str) {
        StringBuilder sb = new StringBuilder();
        if (str.size() == 0) {
            return "";
        }
        for (String s : str) {
            sb.append(String.format("%s%d#", s.isEmpty() ? " " : s, s.length()));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        return str.isBlank() ?
                List.of()
                :
                Arrays.stream(str.split("\\d+#"))
                        .map(s -> s.equals(" ") ? "" : s)
                        .toList();

    }
}
