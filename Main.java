package packagebaru.baru;

public class Main {
    public static void main(String[] args) {
        // membuat objek dari class Triangle
        Shape segitiga = new Triangle(4, 5);

        // membuat objek dari class Circle
        Shape lingkaran = new circle(10);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}