package com.company.main;

public class Fish extends Animal{
    private String scaleColorYohannes56390;

    public Fish(){
        super();
        scaleColorYohannes56390 = " ";
    }

    public Fish(String name, int age, int weight, String scaleColorYohannes56390){
        super(name, age, weight);
        this.scaleColorYohannes56390 = scaleColorYohannes56390;
    }

    public Fish(int age, String scaleColorYohannes56390){
        super(age);
        this.scaleColorYohannes56390 = scaleColorYohannes56390;
    }

    public void drinkMilk(){System.out.println("NO Slurp");}
    public void getVoice(){System.out.println("Fish is making sounds.");}

    @Override
    public void eat(String food) {
        System.out.println("Fish is eating " + food);
    }

    public String getscaleColorYohannes56390() {
        return scaleColorYohannes56390;
    }

    public void setscaleColorYohannes56390(String scaleColorYohannes56390) {
        this.scaleColorYohannes56390 = scaleColorYohannes56390;
    }
    public String toString(){
        return "Fish {" +
                "scale color='" + scaleColorYohannes56390 + '\'' +
                '}';
    }

}
