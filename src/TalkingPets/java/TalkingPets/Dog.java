package TalkingPets;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }


    @Override
    public void petSound() {
        System.out.println("Bark Bark");
    }
}
