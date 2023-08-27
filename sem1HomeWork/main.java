package sem1HomeWork;

public class main {
    public static void main(String[] args) {
        
        Cat c1 = new Cat("Sergei", "Cookie", 5);
        System.out.println(c1);

        c1.greet();
        c1.setNameCat("Suki");
        c1.setAgeCat(7);
        c1.greet();
        c1.setOwner("Oleg");
        c1.greet();


    }
}
