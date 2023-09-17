package box2;

public class Atelier {
    public void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда");
        for(Clothes element: clothes){
            if (element instanceof MenClothing){
                System.out.println(element);
                System.out.println("\n");
            }
        }
    }

    public void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда");
        for(Clothes element: clothes){
            if (element instanceof WomenClothing){
                System.out.println(element);
                System.out.println("\n");
            }
        }
    }
}
