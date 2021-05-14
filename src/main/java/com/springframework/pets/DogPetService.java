package com.springframework.pets;

/**
 * Created by jt on 12/28/19.
 * Modified by cr on 04/23/2021
 */
public class DogPetService implements PetService {
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
