package box3;

import java.util.ArrayList;

public enum Categories {
    Clothes, Chemicals, Electronics, Food;

    private ArrayList<Product> productIn = new ArrayList<Product>();

    public void addProductInCategor(Product el){
       productIn.add(el);
    }

    public void removeProd(int ind, Basket basket){
        basket.getBasket().add(productIn.get(ind - 1));
        productIn.remove(ind-1);
    }


    public ArrayList<Product> getAllProductInCat(){
        return productIn;
    }

    @Override
    public String toString() {
        return "Категория: " + name();
    }
}
