package com.company.main;

public class Blowfish extends Fish{
    private String species;

    Blowfish(){
        super();
        species = " ";
    }

    public Blowfish(String nameYohannes56390, int ageYohannes56390, int weightYohannes56390, String rzadYohannes56390, String species) {
        super(nameYohannes56390, ageYohannes56390, weightYohannes56390, rzadYohannes56390);
        this.species = species;
    }

    public void aport() {System.out.println("The blowfish is swimming.");}

    @Override
    public void drinkMilk() {
        System.out.println("The blowfish is not drinking milk.");
    }

    @Override
    public void getVoice() {
        System.out.println("The blowfish is puffering.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The blowfish is eating " + food);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String breed) {
        this.species = species;
    }
    public String toString(){
        return "Blowfish{" +
                "species='" + species + '\'' +
                '}';
    }

}
