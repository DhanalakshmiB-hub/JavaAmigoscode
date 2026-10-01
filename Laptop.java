public class Laptop {
    String name = " ";
    String proc = " ";
    int ram = 0;
    int price = 0;

    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.name = "Apple";
        lap1.proc ="i7";
        lap1.ram = 216;
        lap1.price = 200000;
        System.out.println(lap1.proc);

        Laptop lap2 = new Laptop();
        lap2.name = "Dell";
        lap2.proc = "i5";
        lap2.ram = 216;
        lap2.price = 150000;
        System.out.println(lap2.price);

        Laptop lap3 = new Laptop();
        lap3.price = 20000;
        System.out.println(lap3.ram);
    }
}
