package packagebaru.baru;

public class circle extends Shape {

    private float radius;

    public circle(float radius) {
        this.radius = radius;
    }
    
    
    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}