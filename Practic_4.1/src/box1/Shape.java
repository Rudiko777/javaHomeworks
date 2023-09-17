package box1;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + type;
    }
}
