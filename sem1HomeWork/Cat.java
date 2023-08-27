package sem1HomeWork;

class Cat extends Owner {
    private String NameCat;
    private Integer AgeCat;
    public Cat(String nameOwner, String nameCat, Integer age) {
        super(nameOwner);
        this.NameCat = nameCat;
        this.AgeCat = age;
    }

    //получаем имя кота
    public String getNameCat(){
        return NameCat;
    }
    //получаем возраст кота
    public Integer getAgeCat(){
        return AgeCat;
    }
    // меняем имя кота 
    public void setNameCat(String newNameCat){
       this.NameCat = newNameCat;
    }
    //меняем возраст кота
    public void setAgeCat(Integer newAgeCat){
        this.AgeCat = newAgeCat;
    }
    //метод изменения хозяина родительского класса
    @Override
    public void setOwner(String newOwner){
        super.setOwner(newOwner);
    }


    //принт инфо о кошке
    public void greet(){
        System.out.println("Мяу! Меня зовут " + NameCat + " Мне "  + AgeCat + " лет " + "Мой хозяин: " + getOwner());
    }

    
    
}
