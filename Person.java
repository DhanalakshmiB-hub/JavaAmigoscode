public class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person nom = new Person("Lary");
        Person neme = nom;
        System.out.println("Before changing:");
        System.out.println(nom.name + " " + neme.name);

        neme.name = "Mary";
        System.out.println("After changing:");
        System.out.println(nom.name + " " + neme.name);
    }
    
}
