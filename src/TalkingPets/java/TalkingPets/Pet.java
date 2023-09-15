package TalkingPets;

public abstract class Pet {
    private String name;
    private String petType;
    public Pet(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    public abstract void petSound();


}
