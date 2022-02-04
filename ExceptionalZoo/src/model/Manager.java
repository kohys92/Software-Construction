package model;

import exceptions.NotHungry;

import java.util.List;

public class Manager {
    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage(){
        System.out.println("Manage is managing the keeper");
        try {
            keeper.feed();
        } catch (NotHungry notHungry) {
            notHungry.printStackTrace();
            System.out.println("Feed less often!");
        }
    }
}