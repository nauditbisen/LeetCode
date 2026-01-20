package DAY8;

import java.util.HashMap;

public class Birds {

    static HashMap<String, HashMap<String, Integer>> data = new HashMap<>();

    String name;
    String type;
    String color;

    void setBird(String name, String type, String color) {

        this.name = name;
        this.type = type;
        this.color = color;

        if (!data.containsKey(type)) {
            data.put(type, new HashMap<>());
        }

        HashMap<String, Integer> colorMap = data.get(type);

        if (colorMap.containsKey(color)) {
            colorMap.put(color, colorMap.get(color) + 1);
        } else {
            colorMap.put(color, 1);
        }
    }

    static void displayTable() {

        System.out.println("Type      Color    Count");
        System.out.println("---------------------------");

        Object[] types = data.keySet().toArray();

        for (int i = 0; i < types.length; i++) {

            String type = types[i].toString();
            HashMap<String, Integer> colorMap = data.get(type);

            Object[] colors = colorMap.keySet().toArray();

            for (int j = 0; j < colors.length; j++) {

                String color = colors[j].toString();
                System.out.println(type + "   " + color + "     "
                                   + colorMap.get(color));
            }
        }
    }
}
