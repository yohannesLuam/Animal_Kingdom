package com.company.main;

public class Dog extends Mammal{
    private String breed;

    Dog(){
        super();
        breed = " ";
    }

    public Dog(String nameYohannes56390, int ageYohannes56390, int weightYohannes56390, String rzadYohannes56390, String breed) {
        super(nameYohannes56390, ageYohannes56390, weightYohannes56390, rzadYohannes56390);
        this.breed = breed;
    }

    public void aport() {System.out.println("The dog is retrieving.");}

    @Override
    public void drinkMilk() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoice() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog is eating " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String toString(){
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
