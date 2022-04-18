package com.company.main;

public class Mammal extends Animal{
    private String orderYohannes56390;

    public Mammal(){
        super();
        orderYohannes56390 = " ";
    }

    public Mammal(String name, int age, int weight, String order){
        super(name, age, weight);
        this.orderYohannes56390 = order;
    }

    public Mammal(int age, String order){
        super(age);
        this.orderYohannes56390 = order;
    }

    public void drinkMilk(){System.out.println("Slurp Slurp");}
    public void getVoice(){System.out.println("Mammal is making sounds.");}

    @Override
    public void eat(String food) {
        System.out.println("Mammal is eating " + food);
    }

    public String getOrder() {
        return orderYohannes56390;
    }

    public void setOrder(String order) {
        this.orderYohannes56390 = order;
    }
    public String toString(){
        return "Mammal {" +
                "order='" + orderYohannes56390 + '\'' +
                '}';
    }
}
