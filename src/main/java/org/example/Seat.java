package org.example;

public abstract class Seat {
    private String id;
    private String nameOfPerson;
    private final int seatCapacity = 10;

    public Seat (String id, String nameOfPerson){
        this.id = id;
        this.nameOfPerson = nameOfPerson;
    }

    public Seat (){
        this("0", "Rose");
    }

    public void meal(){
        System.out.println("Food");
    }

}
