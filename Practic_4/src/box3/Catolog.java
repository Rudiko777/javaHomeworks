package box3;

import java.util.ArrayList;

public class Catolog {
    private ArrayList<Categories> catolog = new ArrayList<Categories>();

    public Catolog(){
        for(Categories el: Categories.values()){
            catolog.add(el);
        }
    }

    public ArrayList<Categories> getList(){
        return catolog;
    }
}
