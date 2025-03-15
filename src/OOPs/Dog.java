package OOPs;

public class Dog {
    String dog_nm;
    String dog_breed;

    public Dog(String name, String breed){
        this.dog_nm=name;
        this.dog_breed=breed;
    }
    public void setName(String name){
        this.dog_nm=name;
    }
    public String getName(){
        return dog_nm;
    }
    public void setBreed(String breed){
        this.dog_breed=breed;
    }
    public String getBreed(){
        return dog_breed;
    }
}
