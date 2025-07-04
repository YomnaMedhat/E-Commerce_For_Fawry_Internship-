import java.util.*;

public class ShippingService {
    public static void ship(List<RequiresShipping> items) {
        if (items.isEmpty()) return;

        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Double> weightMap = new HashMap<>();

        for (RequiresShipping item : items) {
            countMap.put(item.getName(), countMap.getOrDefault(item.getName(), 0) + 1);
            weightMap.put(item.getName(), item.getWeight());
            totalWeight += item.getWeight();
        }

        for (String name : countMap.keySet()) {
            System.out.println(countMap.get(name) + "x " + name);
            System.out.println(weightMap.get(name) * 1000 + "g");
        }

        System.out.printf("Total package weight %.1fkg\n", totalWeight);
    }
}