package box2;

public class Phone {
    private String number;
    private String model;
    private int weight;



    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит {" + name + ", " + number + "}");
    }

    public void sendMess(String[] arg){
        for(String el: arg){
            System.out.println(el);
        }
    }

    public String getNumber(){
      return number;
    }

    @Override
    public String toString(){
        return "Характеристика данного телефона\n" +
                "--------------------------------\n" +
                "номер телефона - " + number + "\n" +
                "модель телефона - " + model + "\n" +
                "вес телефона - " + weight;
    }
}
