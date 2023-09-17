package box2;

public class Test {
    public static void main(String[] args) {
        Phone obj1 = new Phone("891821321", "Iphone 13max", 40);
        Phone obj2 = new Phone("891821411", "Iphone 12max", 30);
        Phone obj3 = new Phone("891841321", "Iphone 11max", 20);

        obj1.receiveCall("Rudik");
        System.out.println(obj1.getNumber());
        obj1.receiveCall("Rudik", obj1.getNumber());
        System.out.println();

        obj2.receiveCall("Nicolay");
        System.out.println(obj2.getNumber());
        obj2.receiveCall("Nicolay", obj2.getNumber());
        System.out.println();

        obj3.receiveCall("Stepan");
        System.out.println(obj3.getNumber());
        obj3.receiveCall("Stepan", obj3.getNumber());
        System.out.println();

        obj1.sendMess(new String[]{obj2.getNumber(), obj3.getNumber()});
//        System.out.println(obj1);
//        System.out.println(obj2);
//        System.out.println(obj3);
    }
}
