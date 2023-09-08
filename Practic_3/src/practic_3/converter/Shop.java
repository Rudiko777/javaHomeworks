package practic_3.converter;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    ArrayList<Product> list = new ArrayList<Product>(Arrays.asList(
            new Product(5794.94),
            new Product(2434.9),
            new Product(1984.93)
    ));

    public ArrayList<Product> getList(){
        return list;
    }

    public double getMinListItem(){
        double min = list.get(0).getPrice();
        for(Product el: list){
            if (el.getPrice() < min){
                min = el.getPrice();
            }
        }
        return min;
    }
}
