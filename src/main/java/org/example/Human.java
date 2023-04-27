package org.example;

public class Human extends Passenger{
    private Seat humanSeat;



    public Human(String id, String nameOfPerson) {
        super(id, nameOfPerson);
    }

    @Override
    public void meal() {
        System.out.println("Human Food");
    }

    //    @Override
//    public void bookSeat() {
//
//    }
}
