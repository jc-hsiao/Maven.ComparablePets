package io.zipcoder;


public class Pet implements Comparable<Pet>{
    private String name;

    public Pet(){
        name = "";
    }

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("I am "+name+" the "+getClass().getSimpleName());
    }

    public int compareTo(Pet p) {
        if(this.getName().compareTo(p.getName())==0)
            return this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
        else
            return this.getName().compareTo(p.getName());
    }

}
