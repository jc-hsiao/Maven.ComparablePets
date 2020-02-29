package io.zipcoder;

public class Dragon extends Pet {
    public Dragon(String name){
        super.setName(name);
    }
    @Override
    public void speak(){
        System.out.println("Rawr! I am "+super.getName()+" the "+getClass().getSimpleName());
    }

}
