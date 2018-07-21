package Counter;

import java.util.*;

public class Counter {
  private Map<String, Integer> counter = new HashMap<>();

  public void init(final String companyName) {
    counter.put(companyName, 0);
  }

  public void increment(final String companyName) {
    int value = counter.get(companyName) + 1;
    counter.put(companyName, value);
  }

  @Override
  public String toString() {
    int sum = 0;
    LinkedHashMap<String, Integer> sortedMap = sortHashMapByValues(this.counter);

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
      sum += entry.getValue();
      sb.append(entry.getKey());
      sb.append(',');
      sb.append(entry.getValue());
      sb.append('\n');
      System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
    }
    System.out.println();
    System.out.println("Sum: " + sum);
    return sb.toString();
  }

  private LinkedHashMap<String, Integer> sortHashMapByValues(Map<String, Integer> passedMap) {
    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
    List<Integer> mapValues = new ArrayList<>(passedMap.values());
    Collections.sort(mapValues, Collections.<Integer>reverseOrder());
    Collections.sort(mapKeys, Collections.<String>reverseOrder());

    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

    for (Integer val: mapValues) {
      Iterator<String> keyIt = mapKeys.iterator();

      while (keyIt.hasNext()) {
        String key = keyIt.next();
        Integer comp1 = passedMap.get(key);

        if (comp1.equals(val)) {
          keyIt.remove();
          sortedMap.put(key, val);
          break;
        }
      }
    }
    return sortedMap;
  }
}
