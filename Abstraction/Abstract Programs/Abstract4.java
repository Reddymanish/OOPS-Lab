abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called");
    }

    abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Abstract4 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
    }
}