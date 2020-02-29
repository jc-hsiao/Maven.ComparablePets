package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());

    public static void main(String[] args){
        int numberOfPets = getIntFromUser("> Please enter number of pets: ");
        String[] petTypes = {"Dog","Cat","Parrot","Ferret","Dragon"};

        System.out.println("// Now please enter a pet name and its type with a space in-between.");
        System.out.println("// Available types are: Dog, Cat, Parrot, Ferret and Dragon");

        List<Pet> pets = new ArrayList<Pet>();
        String[] sArray;
        for(int i=0; i<numberOfPets; i++){
            String s = getStringFromUser("> Enter a pet name and type: ");
            sArray = s.split(" ");
            if( sArray[1].equalsIgnoreCase(petTypes[0]) ){
                pets.add(new Dog(sArray[0]));
            }else if( sArray[1].equalsIgnoreCase(petTypes[1]) ){
                pets.add(new Cat(sArray[0]));
            }else if( sArray[1].equalsIgnoreCase(petTypes[2]) ){
                pets.add(new Parrot(sArray[0]));
            }else if( sArray[1].equalsIgnoreCase(petTypes[3]) ){
                pets.add(new Ferret(sArray[0]));
            }else if( sArray[1].equalsIgnoreCase(petTypes[4]) ){
                pets.add(new Dragon(sArray[0]));
            }
        }
        for(int i=0; i<numberOfPets; i++){
            pets.get(i).speak();
        }

    }
    public static int getIntFromUser(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while(true){
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Input invalid, please enter again: ");
            }
        }
    }

    public static String getStringFromUser(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while(true){
            try {
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.print("Input invalid, please enter again: ");
            }
        }
     }


}

