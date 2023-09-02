package sem1HomeWork;

public class main {
    public static void main(String[] args) {
        
        Cat c1 = new Cat("Sergei", "Cookie", 5);
        System.out.println(c1);
        Cat c2 = new Cat("S13", "Cookie", 5);
        Cat c3 = new Cat("Ser132i", "Cookie", 5);


        c1.greet();
        c1.setNameCat("Suki");
        c1.setAgeCat(7);
        c1.greet();
        c1.setOwner("Oleg");
        c1.greet();
        

        System.out.println(Owner.count); //STATIC: Создали 3х котов, которые наследуют коллекцию хозяев. в коллекции Owner есть STATIC счетчик в методе создания.
        c1.getCityOwner(); //перераспределение метода 
        System.out.println(c1.greet());// дефолтный метод, в интерфейсе Ownerl
        System.out.println(OwnerI.USER_NAME + OwnerI.ID); //Печатаю константу в интерфейсе
        c2.soundOwner();
        c2.soundOwner("Boom"); // данный метод и выше демонстрирует перегрузку

    }
}
