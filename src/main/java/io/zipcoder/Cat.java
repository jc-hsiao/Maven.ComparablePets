package io.zipcoder;

public class Cat extends Pet {
    public Cat(String name){
        super.setName(name);
    }
    @Override
    public void speak(){
        System.out.println("Meow! I am "+super.getName()+" the "+getClass().getSimpleName());
    }
}
