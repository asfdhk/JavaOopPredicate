import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Hello");
        map.put(4, "Java");
        map.put(5, "Human");
        map.put(7, "Man");
        System.out.println(map);
        BiPredicate<Integer, String> filterPredicate = (a, b) -> b.length() == a;
        filterMap(map, filterPredicate);
        System.out.println(map);
    }
    public static <K, V> void filterMap(Map<K, V> map, BiPredicate<K, V> predicate) {
        map.entrySet().removeIf(entry -> !predicate.test(entry.getKey(), entry.getValue()));
    }
}
