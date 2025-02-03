// Step 1: Create an interface for Shapes
interface Shape {
    void draw();
}

// Step 2: Create concrete classes implementing the Shape interface
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Create an Abstract Factory class
abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

// Step 4: Create concrete factories extending AbstractFactory
class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Step 5: Create a Factory Producer to return factories
class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new ShapeFactory(); // Currently, only one factory
    }
}

// Step 6: Demonstrate usage of Abstract Factory Pattern
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Get the Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory();

        // Get and use a Circle object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get and use a Rectangle object
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
