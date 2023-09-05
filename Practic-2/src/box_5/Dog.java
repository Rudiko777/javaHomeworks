package box_5;

public class Dog {
    private String nickname;
    private int age;

    Dog(int age, String nickname){
        this.age = age;
        this.nickname = nickname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void convertToHumanAge(){
        this.age = this.age * 7;
    }

    @Override
    public String toString(){
        return "Dog{" +
                "age=" + age +
                ", nickname=" + nickname + '\'' + '}';
    }
}
