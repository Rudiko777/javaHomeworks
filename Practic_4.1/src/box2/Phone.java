package box2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String recCall(String name){
        return "Звонит {" + name + "}";
    }

    public String recCall(String name, String number){
        return "Звонит {" + name + ", " + number + "}";
    }

    public void sendMess(String[] arg){
        for(String el: arg){
            System.out.println(el);
        }
    }

    public String getNumber(){
      return number;
    }


}
