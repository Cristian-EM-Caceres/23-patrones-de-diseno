package Estructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;
        treeTypes.putIfAbsent(key, new TreeType(name, color));
        return treeTypes.get(key);
    }
}
