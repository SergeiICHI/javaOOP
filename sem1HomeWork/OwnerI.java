package sem1HomeWork;

/**
 * OwnerI
 */
interface OwnerI {
   
    //константы
    String USER_NAME = "Sergei";
    String ID = "12";

    void getAgeOwner();
    void getCityOwner();
    default String greet(){ //по умолчанию
        return "Привет, это дэфлотное приветствие!";
    }
    






    
}