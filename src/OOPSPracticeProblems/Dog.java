package OOPSPracticeProblems;

public class Dog {
    String name;
    String breed;
    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
