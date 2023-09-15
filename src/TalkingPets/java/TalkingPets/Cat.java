package TalkingPets;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void petSound() {
        System.out.println("Meow Meow");
    }
}
