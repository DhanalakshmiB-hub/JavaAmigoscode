import java.time.LocalDate;

public class Rstr {
    public static void main(String[] args)
    {
        String name = new String("Swetha");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(3));

        String coder = new String("tha");
        System.out.println(name.contains(coder));
        System.out.println(name.equals(coder));
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
    
}
