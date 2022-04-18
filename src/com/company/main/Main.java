package com.company.main;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Lenny", 2, 2, "Bat");
        animal[1] = new Dog("Rufus", 10, 15, "Carnivore", "Mastiff");
        animal[2] = new Bird("Perry", 2, 1, "Green");
        animal[3] = new Pigeon("Pablo", 4, 1, "Blue-Green", "Spain");
        animal[4] = new Fish("Nana", 1, 2, "Red");
        animal[5] = new Blowfish("Blowie", 5, 2, "Grey", "Northern Puffer");

        animal[0].getVoice();
        animal[1].getAge();
        animal[2].getName();
        animal[3].getWeight();
        animal[4].eat("sunflower seeds");
    }
}
