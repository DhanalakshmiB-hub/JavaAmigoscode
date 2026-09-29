public class Ageelseif {
    public static void main(String[] args) {
        int age = 20;

        if(age < 13) {
            System.out.println("child");
        }
        else if(age >= 13 && age <= 19) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Adult");
        }
    }
    
}

