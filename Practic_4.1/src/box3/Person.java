package box3;

public class Person {
    private String fullName;
    private int age;

    Person(){};

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(){
        System.out.println("Такой-то " + this + " говорит");
    }

    public void move(){
        System.out.println("Такой-то " + this + " двигается");
    }

    @Override
    public String toString(){
        return "человек по имени " + fullName + ", которому " + age + " лет";
    }
}
