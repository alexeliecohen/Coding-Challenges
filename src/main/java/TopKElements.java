import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.compute(num, (key,oldValue) -> oldValue == null ? 1 : oldValue+1);
        }
        return map.entrySet().stream()
                .sorted((a,b) -> Integer.compare(a.getValue(),b.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
