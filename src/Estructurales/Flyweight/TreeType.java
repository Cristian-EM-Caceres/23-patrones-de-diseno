package Estructurales.Flyweight;

public class TreeType {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Dibujando árbol " + name + " de color " + color + " en (" + x + "," + y + ")");
    }
}