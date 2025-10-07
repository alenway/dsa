class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class DynamiMethod {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle(); // Upcasting
        shapes[2] = new Rectangle(); // Upcasting

        for (Shape shape : shapes) {
            shape.draw(); // Dynamic method dispatch
            // Output:
            // Drawing a shape
            // Drawing a circle
            // Drawing a rectangle
        }
    }
}
