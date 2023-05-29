package javaOOP.semLesson6.Solid4Lsp1;

import javaOOP.semLesson6.Solid4Lsp1.lsp.Rectangle;

public class ViewShape {
    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}
