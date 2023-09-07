package box3;

import java.util.ArrayList;

public enum Categories {
    Clothes, Chemicals, Electronics, Food;

    private ArrayList<Product> productIn;

    Categories(ArrayList<Product> product){
        for(Product el: product){
            switch (el.getCategor()){
                case Clothes:
                    productIn.add(el); break;

                case Chemicals:
                    productIn.add(el); break;

                case Electronics:
                    productIn.add(el); break;

                case Food:
                    productIn.add(el); break;
            }
        }
    }

    Categories(){}

    public ArrayList<Product> getAllProductInCat(){
        return productIn;
    }

    @Override
    public String toString() {
        return "Категория: " + name();
    }
}
