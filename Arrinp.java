import java.util.Scanner;
public class Arrinp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i=0; i<=size-1; i=i+1) {
            marks[i] = sc.nextInt();
        }
        System.out.println(marks[2]);
    }
    
}
