package box1;

public class Share {
    private String type;

    public Share(String type) {
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
