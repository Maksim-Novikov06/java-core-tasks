package OOP.inheritance_and_polymorphism;

import java.awt.*;

public class Canvas {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Triangle(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }


}
