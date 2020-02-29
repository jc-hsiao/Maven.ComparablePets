package io.zipcoder;

public class Parrot extends Pet {
    public Parrot(String name){
        super.setName(name);
    }
    @Override
    public void speak(){
        System.out.println("Squawk! I am "+super.getName()+" the "+getClass().getSimpleName());
    }
}
