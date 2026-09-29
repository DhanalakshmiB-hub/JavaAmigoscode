public class Forodd {
    public static void main(String[] args) {
        for(int i=1; i<=10; i=i+1) {
            if(i%2 == 0) {
                System.out.println("Even number: " + i);
            }
            else {
                System.out.println("Odd number: " + i);
            }
        }
    }
}
