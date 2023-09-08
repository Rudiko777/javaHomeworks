package box4;

public enum Name {
    Asus, Lenovo, Honor, Huawei, Mac;

    @Override
    public String toString() {
        return "марка: " + name();
    }
}
