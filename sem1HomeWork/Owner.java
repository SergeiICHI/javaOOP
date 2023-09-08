package sem1HomeWork;

/**
 * Owner
 */
class Owner implements OwnerI{
    private String Name;
    static Integer count = 0; // счетчик кол созданных хозяев
    public Owner(String name){
        this.Name = name;
        count++; // счетчик работает в методе создания 
    }
    
    
    String getOwner(){
        return Name;
    }



    void soundOwner(){ // перегрузка метода
        System.out.println("Boom");
    }
    void soundOwner(String x){
        System.out.println(x + "а это перегрузка\n"); 
    }


    public void setOwner(String newOwnerName){
        this.Name = newOwnerName;
    }


    //перераспределение методов из интерфейса 
    @Override
    public void getAgeOwner(){
        System.out.println("25");
    }
    @Override
    public void getCityOwner(){
        System.out.println("Город москва, перегрузка метода");
    }
    
    
    

}