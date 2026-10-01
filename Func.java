public class Func {
    void greeting() {
        System.out.println("Welcome");
        dummy();
    }
    void dummy() {
        System.out.println("Hey");
    }
    public static void main(String[] args) {
        Func obj1 = new Func();
        obj1.dummy();
        
    }
    
}
