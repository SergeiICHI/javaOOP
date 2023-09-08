package sem1HomeWork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;


class main {
    public static void main(String[] args) {
        
        Cat c1 = new Cat("Sergei", "Cookie", 5);
        System.out.println(c1);
        Cat c2 = new Cat("S13", "Markiz", 5);
        Cat c3 = new Cat("Ser132i", "Cookie", 5);


        c1.greet();
        c1.setNameCat("Boss");
        c1.setAgeCat(6);
        c1.greet();
        c1.setOwner("Oleg");
        c1.greet();
        

        System.out.println(Owner.count); //STATIC: Создали 3х котов, которые наследуют коллекцию хозяев. в коллекции Owner есть STATIC счетчик в методе создания.
        c1.getCityOwner(); //перераспределение метода 
        System.out.println(c1.greet());// дефолтный метод, в интерфейсе Ownerl
        System.out.println(OwnerI.USER_NAME + OwnerI.ID); //Печатаю константу в интерфейсе
        c2.soundOwner();
        c2.soundOwner("Boom"); // данный метод и выше демонстрирует перегрузку

        
        ArrayList<Integer> agesOfcats = new ArrayList<>();
        agesOfcats.add(c1.getAgeCat());
        agesOfcats.add(c2.getAgeCat());
        agesOfcats.add(c3.getAgeCat());

        
      
        
        Iterator<Integer> iterator = agesOfcats.iterator();
        
        //Используем библиотеку(интерфейс) Iterator
        System.out.println("Используем итератор для перечисления значений.\nЧерез функцию boolean, встроенную в интерфейсе");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        

        List<Cat> allCats = new ArrayList<>();
        allCats.add(c1);
        allCats.add(c2);
        allCats.add(c3);

        for (Cat cat : allCats) {
            System.out.println(cat.getAgeCat() + " " +  cat.getNameCat());
        }



        //с помощью компаратора отсортируем ageCat
        
        Comparator<Cat> ageComparator = Comparator.comparingInt(x -> x.getAgeCat());

        Collections.sort(allCats, ageComparator);

        System.out.println("\nс помощью компаратора отсортируем по ageCat");
        for (Cat cat : allCats) {
            System.out.println(cat.getAgeCat() + " " + cat.getNameCat());
            
        }

        //собственный интерфейс проверка на четность года
        
       
        System.out.println("\nПроверка на четность");
        ParityCheck  catCount = (x) -> {
            for(int i =0; i < x.size(); i++){
                if(x.get(i)%2 !=0){
                    System.out.println(x.get(i) + " не является четным годом");
                }
                else{
                    System.out.println(x.get(i) + " является четным годом");
                }
            } 
    };
        
        catCount.getCountOfCats(agesOfcats);
    }
}
    

