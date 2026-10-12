package Estructurales.Flyweight;

public class Main {
    public static void main(String[] args) {
        TreeType type = TreeFactory.getTreeType("Pino", "Verde Oscuro");
        Tree tree1 = new Tree(10, 20, type);
        Tree tree2 = new Tree(15, 25, type);

        tree1.draw();
        tree2.draw();
    }
}