import java.util.Scanner;
public class Arrinput {
    public static void main(String[] args) {
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        
        score[0] = sc.nextInt();
        score[1] = sc.nextInt();
        score[2] = sc.nextInt();
        score[3] = sc.nextInt();
        score[4] = sc.nextInt();
        
        int sum = score[0]+score[1]+score[2]+score[3]+score[4]; {
        System.out.println("Sum = " + sum);
        }
    }
    
}
