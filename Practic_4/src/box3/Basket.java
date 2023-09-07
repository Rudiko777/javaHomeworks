package box3;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> basket = new ArrayList<Product>();

    public void getProduct(Product product){
        basket.add(product);
    }
}
