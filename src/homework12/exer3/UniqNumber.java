package exer3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqNumber {
    public static void main(String[] args) {
        List<String> wordsList = List.of("apple", "banana", "orange", "Apple", "banana", "kiwi");

        Map<String, Integer> uniqMap = new HashMap<>();

        for (String word : wordsList) {

            int frequency = uniqMap.getOrDefault(word, 0);

            uniqMap.put(word, frequency + 1);
            System.out.println(uniqMap);
        }

        for (Map.Entry<String, Integer> entry : uniqMap.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Частота: " + entry.getValue());
        }
    }
}
