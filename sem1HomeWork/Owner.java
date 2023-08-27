package sem1HomeWork;

/**
 * Owner
 */
class Owner {
    private String Name;
    
    public Owner(String name){
        this.Name = name;
    }
    

    public String getOwner(){
        return Name;
    }

    public void setOwner(String newOwnerName){
        this.Name = newOwnerName;

    }
}