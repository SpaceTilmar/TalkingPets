package TalkingPets;

import java.util.*;

public class TalkingPets {
    public static void main(String[] args) {
        System.out.println("Hello! How many pets do you have? 1, 2, or 3? " );
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        System.out.println(response);

        Pet pets[] = new Pet[response];

        for(int i = 0; i < response; i++){
            System.out.println("What types of pets do you have? \n" + "1. Dog \n 2. Cat \n 3. Platypus");
            int responseType = scanner.nextInt();
            System.out.println("What is your pets name");
            String responseName = scanner.next();
            Pet newPet;
            if(responseType == 1){

                newPet = new Dog(responseName);

            }
            else if(responseType == 2){
                newPet = new Cat(responseName);

            }
            else if(responseType == 3){
                newPet = new Platypus(responseName);
            }
            else{
                newPet = null;
            }
            System.out.println(newPet.getName());
            pets[i] = newPet;
        }
        for(int x = 0; x < pets.length; x++){
            System.out.println(pets[x].getName());
            pets[x].petSound();
        }
    }
}