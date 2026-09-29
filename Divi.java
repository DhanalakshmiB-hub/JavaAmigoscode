import java.util.Scanner;
public class Divi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%3)==0 && (num%5)==0) {
            System.out.println("Number divisible by 3 and 5");
        }
        else {
            System.out.println("Number not divisible by 3 and 5");
        }
    }
    
}
