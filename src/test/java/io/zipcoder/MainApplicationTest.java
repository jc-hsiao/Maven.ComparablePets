package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    @Test
    public void petNullConstructorTest(){
        Pet p = new Pet();
        Assert.assertEquals("",p.getName());
    }

    @Test
    public void petConstructorTest(){
        Pet p = new Pet("Max");
        Assert.assertEquals("Max",p.getName());
    }

    @Test
    public void petSetNameTest(){
        Pet p = new Pet();
        p.setName("Fido");
        Assert.assertEquals("Fido",p.getName());
    }

    @Test
    public void petGetNameTest(){
        Pet p = new Pet("Kiki");
        Assert.assertEquals("Kiki",p.getName());
    }

    @Test
    public void petSpeakTest(){
        Pet p = new Pet("Momo");
        p.speak();
    }

    @Test
    public void dogConstructorTest(){
        Dog d = new Dog("Ammy");
        Assert.assertEquals("Ammy",d.getName());
    }

    @Test
    public void dogSpeakTest(){
        Dog d = new Dog("Ammy");
        d.speak();
    }


    @Test
    public void catConstructorTest(){
        Cat c = new Cat("Miso");
        Assert.assertEquals("Miso",c.getName());
    }

    @Test
    public void catSpeakTest(){
        Cat c = new Cat("Miso");
        c.speak();
    }


    @Test
    public void parrotConstructorTest(){
        Parrot p = new Parrot("Alex");
        Assert.assertEquals("Alex",p.getName());
    }

    @Test
    public void parrotSpeakTest(){
        Parrot p = new Parrot("Alex");
        p.speak();
    }


    @Test
    public void ferretConstructorTest(){
        Ferret f = new Ferret("Nick");
        Assert.assertEquals("Nick",f.getName());
    }

    @Test
    public void ferretSpeakTest(){
        Ferret f = new Ferret("Nick");
        f.speak();
    }


    @Test
    public void dragonConstructorTest(){
        Dragon d = new Dragon("Malroth");
        Assert.assertEquals("",d.getName());
    }

    @Test
    public void dragonSpeakTest(){
        Dragon d = new Dragon("Malroth");
        d.speak();
    }

    @Test
    public void petSort1Test(){
        ArrayList<Pet> a = new ArrayList<>();

        Pet snowDog = new Dog("Snow");
        Pet snowCat = new Cat("Snow");

        a.add(snowDog);
        a.add(new Dog("Ammy"));
        a.add(new Parrot("JJ"));
        a.add(new Parrot("QQ"));
        a.add(new Ferret("Nick"));
        a.add(new Dragon("Lord"));
        a.add(snowCat);

        Collections.sort(a);
        for (Pet p:a) {
            //p.speak();
            System.out.println(p.getName()+ " the "+ p.getClass().getSimpleName());
        }

        Assert.assertTrue( a.indexOf(snowDog) > a.indexOf(snowCat) );
    }


    @Test
    public void petComparatorTest(){
        ArrayList<Pet> a = new ArrayList<>();

        Pet dragon1 = new Dragon("Malroth");
        Pet dragon2 = new Dragon("Grima");
        Pet parrot1 = new Parrot("Polly");
        Pet parrot2 = new Parrot("Captain");


        a.add(dragon1);
        a.add(parrot1);
        a.add(new Dog("Ammy"));
        a.add(new Dog("Coco"));
        a.add(new Ferret("Nick"));
        a.add(dragon2);
        a.add(parrot2);

        PetComparator pc = new PetComparator();
        a.sort(pc);

        for (Pet p:a) {
            //p.speak();
            System.out.println(p.getClass().getSimpleName()+"'s name is "+ p.getName());
        }
        Assert.assertTrue( a.indexOf(dragon1) > a.indexOf(dragon2) );
        Assert.assertTrue( a.indexOf(parrot1) > a.indexOf(parrot2) );
    }

}



