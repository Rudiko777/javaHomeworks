package box3;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> basket = new ArrayList<Product>();
    boolean system = true;

    public void getProduct(Product product){
        basket.add(product);
    }

    public void systemOff(){
        system = false;
    }

    public boolean isSystem() {
        return system;
    }

    public void showBasket(){
        if(basket.isEmpty()){
            System.out.println("Корзина пуста!");
            return;
        }

        int i = 1;
        for(Product el: basket){
            System.out.println(i + ") " + el );
            i++;
        }
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }
}
