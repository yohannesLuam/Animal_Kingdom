package com.company.main;

public class Pigeon extends Bird{
    private String type;

    Pigeon(){
        super();
        type = " ";
    }

    public Pigeon(String nameYohannes56390, int ageYohannes56390, int weightYohannes56390, String rzadYohannes56390, String type) {
        super(nameYohannes56390, ageYohannes56390, weightYohannes56390, rzadYohannes56390);
        this.type = type;
    }

    public void aport() {System.out.println("The pigeon is flying.");}

    @Override
    public void drinkMilk() {
        System.out.println("The pigeon is drinking milk.");
    }

    @Override
    public void getVoice() {
        System.out.println("The pigeon is cooing.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The pigeon is eating " + food);
    }

    public String getType() {
        return type;
    }

    public void setType(String breed) {
        this.type = type;
    }
    public String toString(){
        return "Pigeon{" +
                "type='" + type + '\'' +
                '}';
    }


}
