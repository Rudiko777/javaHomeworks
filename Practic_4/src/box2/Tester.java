package box2;

public class Tester {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new TShirt(Sizes.XXS, 422.4, "красная"),
                new TShirt(Sizes.M, 133.3, "чёрная"),
                new Skirt(Sizes.S, 4423.2, "розовая"),
                new Skirt(Sizes.XS, 532.9, "синяя"),
                new Pants(Sizes.L, 3111.3, "белые"),
                new Pants(Sizes.M, 313.3, "чёрные"),
                new Tie(Sizes.L, 3413.3, "белый"),
                new Tie(Sizes.L, 1245.4, "чёрный"),
        };

        Atelier alt = new Atelier();
        alt.dressMan(clothes);
        alt.dressWomen(clothes);
    }
}
