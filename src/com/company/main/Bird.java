package com.company.main;

public class Bird extends Animal{
    private String featherColorYohannes56390;

    public Bird(){
        super();
        featherColorYohannes56390 = " ";
    }

    public Bird(String name, int age, int weight, String featherColorYohannes56390){
        super(name, age, weight);
        this.featherColorYohannes56390 = featherColorYohannes56390;
    }

    public Bird(int age, String featherColorYohannes56390){
        super(age);
        this.featherColorYohannes56390 = featherColorYohannes56390;
    }

    public void drinkMilk(){System.out.println("Slurp Slurp");}
    public void getVoice(){System.out.println("Bird is making sounds.");}

    @Override
    public void eat(String food) {
        System.out.println("Bird is eating " + food);
    }

    public String getFeatherColorYohannes56390() {
        return featherColorYohannes56390;
    }

    public void setfeatherColorYohannes56390(String order) {
        this.featherColorYohannes56390 = featherColorYohannes56390;
    }
    public String toString(){
        return "Bird {" +
                "feather color='" + featherColorYohannes56390 + '\'' +
                '}';
    }
}

