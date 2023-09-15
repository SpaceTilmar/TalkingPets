package TalkingPets;

public class Platypus extends Pet{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public void petSound() {
        System.out.println("Platypus Noises");
    }
}
