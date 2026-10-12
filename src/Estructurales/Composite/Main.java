package Estructurales.Composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Documento.txt");
        FileSystemComponent file2 = new File("Foto.png");

        Directory root = new Directory("Raíz");
        Directory subDir = new Directory("Documentos");

        subDir.add(file1);
        subDir.add(file2);
        root.add(subDir);

        root.showDetails();
    }
}