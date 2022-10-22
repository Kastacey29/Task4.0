import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> lists = new HashMap<>();
        Random random = new Random();
        lists.put("1 список", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        lists.put("2 список", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        lists.put("3 список", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        lists.put("4 список", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        lists.put("5 список", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        System.out.println(lists.toString());

        Map<String, Integer> list2 = new HashMap<>();

        for (Map.Entry<String, List<Integer>> list : lists.entrySet()) {
            int sum = 0;
            for (int i = 0; i < list.getValue().size(); i++) {
                sum += list.getValue().get(i);
            }
            list2.put(list.getKey(), sum);

        }
        System.out.println(list2.toString());

        System.out.println();
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(23, "Kate");
        map.put(45, "Hurry");
        map.put(89, "Genry");
        map.put(75, "Oliviya");
        map.put(89, "Mary");
        map.put(12, "Ginny");
        map.put(15, "Stanly");
        map.put(47, "Mary");
        map.put(74, "Donald");
        map.put(76, "Orion");

        for (Map.Entry<Integer, String> number : map.entrySet()) {
            System.out.println(number.getKey() + " " + number.getValue());
        }

    }
}